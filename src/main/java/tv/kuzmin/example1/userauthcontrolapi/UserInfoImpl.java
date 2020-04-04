package tv.kuzmin.example1.userauthcontrolapi;


import java.io.Serializable;


public class UserInfoImpl implements UserInfo, Serializable
{
    private static final long serialVersionUID = -76L;

    private final String username;

    private final String familyName;

    private final String givenName;

    private final String description;

    private final String address;

    public UserInfoImpl(Builder builder)
    {
        this.username = builder.username;
        this.familyName = builder.familyName;
        this.givenName = builder.givenName;
        this.description = builder.description;
        this.address = builder.address;
    }


    public String getUsername()
    {
        return username;
    }


    public String getFamilyName()
    {
        return familyName;
    }


    public String getGivenName()
    {
        return givenName;
    }


    public String getDescription()
    {
        return description;
    }


    public String getAddress()
    {
        return address;
    }


    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private String username;

        private String familyName;

        private String givenName;

        private String description;

        private String address;

        private Builder()
        {
        }


        public Builder setUsername(String username)
        {
            this.username = username;
            return this;
        }


        public Builder setFamilyName(String familyName)
        {
            this.familyName = familyName;
            return this;
        }


        public Builder setGivenName(String givenName)
        {
            this.givenName = givenName;
            return this;
        }


        public Builder setDescription(String description)
        {
            this.description = description;
            return this;
        }


        public Builder setAddress(String address)
        {
            this.address = address;
            return this;
        }


        public UserInfo build()
        {
            return new UserInfoImpl(this);
        }
    }
}
