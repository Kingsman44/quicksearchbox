package com.bumptech.glide.load.p297b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.ae */
/* compiled from: PG */
public final class C5753ae {

    /* renamed from: b */
    private static final String f17328b;

    /* renamed from: c */
    private static final Map f17329c;

    /* renamed from: a */
    public boolean f17330a = true;

    /* renamed from: d */
    private boolean f17331d = true;

    /* renamed from: e */
    private Map f17332e = f17329c;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if (charAt <= 31) {
                    if (charAt == 9) {
                        charAt = 9;
                    }
                    sb.append('?');
                }
                if (charAt < 127) {
                    sb.append(charAt);
                }
                sb.append('?');
            }
            property = sb.toString();
        }
        f17328b = property;
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new C5754af(property)));
        }
        f17329c = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public final C5755ag mo12255a() {
        this.f17331d = true;
        return new C5755ag(this.f17332e);
    }

    /* renamed from: b */
    public final void mo12256b() {
        if (this.f17331d) {
            this.f17331d = false;
            HashMap hashMap = new HashMap(this.f17332e.size());
            for (Map.Entry entry : this.f17332e.entrySet()) {
                hashMap.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            this.f17332e = hashMap;
        }
    }

    /* renamed from: c */
    public final List mo12257c() {
        List list = (List) this.f17332e.get("Authorization");
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f17332e.put("Authorization", arrayList);
        return arrayList;
    }
}
