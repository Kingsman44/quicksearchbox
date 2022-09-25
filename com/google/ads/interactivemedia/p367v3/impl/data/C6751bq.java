package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.UiElement;
import com.google.ads.interactivemedia.p367v3.internal.agt;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bq */
/* compiled from: PG */
public final class C6751bq implements UiElement {
    public static final agt GSON_TYPE_ADAPTER = new C6750bp();
    private final String name;

    public C6751bq(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C6751bq)) {
            return this.name.equals(((C6751bq) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name});
    }

    public String toString() {
        String str = this.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20);
        sb.append("UiElementImpl[name=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
