package com.google.android.libraries.elements.internal;

import com.facebook.p313c.C6032c;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21315v;
import com.google.android.libraries.elements.p1707b.C20694a;
import com.google.android.libraries.elements.p1729h.C21216n;
import com.google.common.base.C58833ax;
import dagger.C68214a;
import java.util.HashSet;

/* renamed from: com.google.android.libraries.elements.internal.i */
/* compiled from: PG */
public final class C21348i {
    /* renamed from: a */
    public static C21315v m40362a(C58833ax axVar) {
        return (C21315v) axVar.mo56109e(C21315v.f59678a);
    }

    /* renamed from: b */
    public static C21259bb m40363b(C58833ax axVar, C58833ax axVar2, C68214a aVar) {
        C21259bb bbVar;
        if (!((Boolean) axVar2.mo56109e(false)).booleanValue()) {
            bbVar = (C21259bb) axVar.mo56109e(new C21324ad());
        } else if (axVar.mo56113h()) {
            HashSet hashSet = new HashSet();
            hashSet.add((C21259bb) aVar.mo27525b());
            hashSet.add((C21259bb) axVar.mo56107c());
            bbVar = new C20694a(hashSet);
        } else {
            bbVar = (C21259bb) aVar.mo27525b();
        }
        C6032c.f17760a = new C21216n(bbVar);
        return bbVar;
    }
}
