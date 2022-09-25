package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.shared.logger.p7051b.C89860j;
import com.google.android.apps.gsa.shared.logger.p7051b.C89862l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89871u;
import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.android.libraries.gsa.p1864f.p1865a.C22811d;
import com.google.android.libraries.gsa.p1864f.p1865a.C22813f;
import com.google.android.libraries.gsa.p1864f.p1865a.p1866a.C22805a;
import com.google.android.libraries.gsa.p1864f.p1865a.p1866a.C22806b;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.d */
/* compiled from: PG */
public final class C97569d {

    /* renamed from: a */
    public static final C59071e f272567a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ce.d");

    /* renamed from: b */
    public boolean f272568b = false;

    /* renamed from: c */
    public final NavigableSet f272569c = new TreeSet();

    /* renamed from: d */
    public final List f272570d = new ArrayList();

    /* renamed from: e */
    public final List f272571e = new ArrayList();

    /* renamed from: f */
    public final C89862l f272572f;

    /* renamed from: g */
    public final C89860j f272573g = new C97568c(this);

    public C97569d(C89862l lVar) {
        this.f272572f = lVar;
    }

    /* renamed from: a */
    public static C22806b m161701a(NavigableSet navigableSet) {
        C22805a aVar = (C22805a) C22806b.f62793d.createBuilder();
        Iterator it = navigableSet.iterator();
        while (it.hasNext()) {
            C22811d a = C22813f.m42628a((C22804a) it.next());
            aVar.copyOnWrite();
            C22806b bVar = (C22806b) aVar.instance;
            a.getClass();
            C62971cq cqVar = bVar.f62796b;
            if (!cqVar.mo58948c()) {
                bVar.f62796b = C62942bv.mutableCopy(cqVar);
            }
            bVar.f62796b.add(a);
        }
        int i = C89871u.m146333a(((C22804a) navigableSet.first()).f62786a, ((C22804a) navigableSet.last()).f62786a).f246200fb;
        aVar.copyOnWrite();
        C22806b bVar2 = (C22806b) aVar.instance;
        bVar2.f62795a |= 1;
        bVar2.f62797c = i;
        return (C22806b) aVar.build();
    }
}
