package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.base.aq */
/* compiled from: PG */
public final class C58826aq {

    /* renamed from: a */
    private final C58827ar f156621a;

    /* renamed from: b */
    private final String f156622b;

    public C58826aq(C58827ar arVar, String str) {
        this.f156621a = arVar;
        this.f156622b = str;
    }

    /* renamed from: a */
    public final String mo56095a(Map map) {
        Iterator it = map.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        mo56096b(sb, it);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo56096b(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append(this.f156621a.mo56091a(entry.getKey()));
                sb.append(this.f156622b);
                sb.append(this.f156621a.mo56091a(entry.getValue()));
                while (it.hasNext()) {
                    sb.append(this.f156621a.f156623c);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(this.f156621a.mo56091a(entry2.getKey()));
                    sb.append(this.f156622b);
                    sb.append(this.f156621a.mo56091a(entry2.getValue()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
