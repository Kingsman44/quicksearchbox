package com.google.android.libraries.p1649b.p1651b;

import com.google.android.libraries.p1649b.p1650a.C19606c;
import com.google.android.libraries.p1649b.p1650a.C19610g;
import com.google.android.libraries.p1649b.p1652c.C19622a;
import com.google.android.libraries.p1649b.p1653d.C19624b;
import com.google.android.libraries.p1649b.p1654e.C19626a;
import com.google.android.libraries.p1649b.p1656g.C19634b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.b.b.h */
/* compiled from: PG */
public final class C19618h {

    /* renamed from: a */
    public static final String f54585a = "h";

    /* renamed from: b */
    public final C19610g f54586b;

    /* renamed from: c */
    public final C19634b f54587c = new C19634b();

    /* renamed from: d */
    public final Map f54588d = new HashMap();

    /* renamed from: e */
    public C19619i f54589e;

    /* renamed from: f */
    public C19606c f54590f;

    /* renamed from: g */
    public C19626a f54591g;

    /* renamed from: h */
    public C19622a f54592h;

    public C19618h(C19610g gVar) {
        this.f54586b = gVar;
    }

    /* renamed from: a */
    public final void mo24950a(C19624b bVar, C19611a aVar) {
        List list = (List) this.f54588d.get(bVar);
        if (list == null) {
            list = new ArrayList();
            this.f54588d.put(bVar, list);
        }
        list.add(aVar);
        this.f54587c.mo24962c(bVar, aVar);
    }
}
