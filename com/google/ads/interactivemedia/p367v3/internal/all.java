package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.C6706Ad;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.all */
/* compiled from: PG */
public final class all implements AdEvent {

    /* renamed from: a */
    private final AdEvent.AdEventType f20886a;

    /* renamed from: b */
    private final C6706Ad f20887b;

    /* renamed from: c */
    private final Map f20888c;

    public all(AdEvent.AdEventType adEventType, C6706Ad ad, Map map) {
        this.f20886a = adEventType;
        this.f20887b = ad;
        this.f20888c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof all)) {
            return false;
        }
        all all = (all) obj;
        return this.f20886a == all.f20886a && apz.m19253b(this.f20887b, all.f20887b) && apz.m19253b(this.f20888c, all.f20888c);
    }

    public final C6706Ad getAd() {
        return this.f20887b;
    }

    public final Map getAdData() {
        return this.f20888c;
    }

    public final AdEvent.AdEventType getType() {
        return this.f20886a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20886a, this.f20887b, this.f20888c});
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(String.format("AdEvent[type=%s, ad=%s", new Object[]{this.f20886a, this.f20887b}));
        if (this.f20888c == null) {
            str = "]";
        } else {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder("{");
            Iterator it = this.f20888c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            objArr[0] = sb.toString();
            str = String.format(", adData=%s]", objArr);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
