package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amq */
/* compiled from: PG */
public final class amq implements ImaSdkSettings {
    private boolean autoPlayAdBreaks = true;
    private boolean debugMode = false;
    private transient String language = "en";
    private int numRedirects = 4;
    private String playerType;
    private String playerVersion;
    private String ppid;
    private transient boolean restrictToCustomPlayer;
    private final boolean supportsMultipleVideoDisplayChannels = true;

    public boolean doesRestrictToCustomPlayer() {
        return this.restrictToCustomPlayer;
    }

    public boolean getAutoPlayAdBreaks() {
        return this.autoPlayAdBreaks;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getMaxRedirects() {
        return this.numRedirects;
    }

    public String getPlayerType() {
        return this.playerType;
    }

    public String getPlayerVersion() {
        return this.playerVersion;
    }

    public String getPpid() {
        return this.ppid;
    }

    public boolean isDebugMode() {
        return this.debugMode;
    }

    public void setAutoPlayAdBreaks(boolean z) {
        this.autoPlayAdBreaks = z;
    }

    public void setDebugMode(boolean z) {
        this.debugMode = z;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMaxRedirects(int i) {
        this.numRedirects = i;
    }

    public void setPlayerType(String str) {
        this.playerType = str;
    }

    public void setPlayerVersion(String str) {
        this.playerVersion = str;
    }

    public void setPpid(String str) {
        this.ppid = str;
    }

    public void setRestrictToCustomPlayer(boolean z) {
        this.restrictToCustomPlayer = z;
    }

    public String toString() {
        String str = this.ppid;
        int i = this.numRedirects;
        String str2 = this.playerType;
        String str3 = this.playerVersion;
        String str4 = this.language;
        boolean z = this.restrictToCustomPlayer;
        boolean z2 = this.autoPlayAdBreaks;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 136 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("ImaSdkSettings [ppid=");
        sb.append(str);
        sb.append(", numRedirects=");
        sb.append(i);
        sb.append(", playerType=");
        sb.append(str2);
        sb.append(", playerVersion=");
        sb.append(str3);
        sb.append(", language=");
        sb.append(str4);
        sb.append(", restrictToCustom=");
        sb.append(z);
        sb.append(", autoPlayAdBreaks=");
        sb.append(z2);
        sb.append("]");
        return sb.toString();
    }
}
