package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8511i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.gms.appdatasearch.C142796al;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.i.a */
/* compiled from: PG */
public final class C111532a {

    /* renamed from: a */
    public static final C58974d f310222a = C58974d.m91136j();

    /* renamed from: b */
    public final PackageManager f310223b;

    /* renamed from: c */
    public final C86124t f310224c;

    public C111532a(Context context, C86124t tVar) {
        this.f310223b = context.getPackageManager();
        this.f310224c = tVar;
    }

    /* renamed from: a */
    public static String m185295a(C142796al alVar, String str) {
        C58148f fVar;
        ByteBuffer j = alVar.mo117714j();
        if (j == null) {
            return null;
        }
        try {
            fVar = (C58148f) C62942bv.parseFrom((C62942bv) C58148f.f155452f, j, C62921ba.m95368a());
        } catch (C62974ct unused) {
            fVar = null;
        }
        if (fVar == null) {
            return null;
        }
        for (C58146d dVar : fVar.f155457d) {
            if (!dVar.f155449e.isEmpty() && TextUtils.equals(dVar.f155446b, str)) {
                return (String) dVar.f155449e.get(0);
            }
        }
        ((C58970a) ((C58970a) f310222a.mo56226d()).mo56372aa(27238)).mo56386p("No string found.");
        return null;
    }
}
