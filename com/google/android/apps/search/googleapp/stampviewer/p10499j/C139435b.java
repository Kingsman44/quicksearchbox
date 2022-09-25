package com.google.android.apps.search.googleapp.stampviewer.p10499j;

import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.p4242bp.p4253e.p4254a.C56182b;
import com.google.p4242bp.p4253e.p4254a.C56184d;
import com.google.p4242bp.p4253e.p4254a.C56186f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.j.b */
/* compiled from: PG */
public final class C139435b {
    /* renamed from: a */
    public static Optional m226584a(C139392b bVar) {
        C56610b bVar2 = bVar.f379032b;
        if (bVar2 == null) {
            bVar2 = C56610b.f151140k;
        }
        C56622n nVar = bVar2.f151150i;
        if (nVar == null) {
            nVar = C56622n.f151177e;
        }
        C56182b bVar3 = nVar.f151180b;
        if (bVar3 == null) {
            bVar3 = C56182b.f149689f;
        }
        if (!bVar3.f149695e) {
            return Optional.empty();
        }
        for (C56184d dVar : bVar3.f149694d) {
            int a = C56186f.m87917a(dVar.f149699b);
            if (a != 0 && a == 2 && dVar.f149698a.length() > 0) {
                return Optional.m71637of(dVar);
            }
        }
        return Optional.empty();
    }
}
