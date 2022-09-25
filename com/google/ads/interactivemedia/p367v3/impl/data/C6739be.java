package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.auj;
import com.google.ads.interactivemedia.p367v3.internal.aul;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.be */
/* compiled from: PG */
public final class C6739be {
    public int errorCode;
    public String errorMessage;
    public String innerError;
    public String type;

    public Map constructMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", this.type);
        hashMap.put("errorCode", String.valueOf(this.errorCode));
        hashMap.put("errorMessage", this.errorMessage);
        String str = this.innerError;
        if (str != null) {
            hashMap.put("innerError", str);
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        return auj.m19669c(this, obj, new String[0]);
    }

    public int hashCode() {
        return aul.m19677b(this, new String[0]);
    }

    public String toString() {
        return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", new Object[]{this.type, Integer.valueOf(this.errorCode), this.errorMessage, this.innerError});
    }
}
