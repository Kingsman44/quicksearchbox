package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.ByteBuffer;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.e */
/* compiled from: PG */
public final /* synthetic */ class C130818e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C130818e f358059a = new C130818e();

    private /* synthetic */ C130818e() {
    }

    public final Object apply(Object obj) {
        C58480gp e = C58485gu.m89837e();
        C142797am amVar = new C142797am((SearchResults) obj);
        while (amVar.hasNext()) {
            ByteBuffer j = amVar.next().mo117714j();
            if (j == null) {
                ((C59052c) ((C59052c) C130820g.f358061a.mo56226d()).mo56372aa(38977)).mo56386p("Failed to get Icing section.");
            } else {
                byte[] bArr = new byte[j.remaining()];
                j.get(bArr);
                try {
                    C58148f fVar = (C58148f) C62942bv.parseFrom((C62942bv) C58148f.f155452f, bArr, C62921ba.m95368a());
                    if (!fVar.f155455b.equals("Alarm")) {
                        ((C59052c) ((C59052c) C130820g.f358061a.mo56226d()).mo56372aa(38975)).mo56389s("Expected alarm Icing entry, got %s", fVar.f155455b);
                    } else {
                        Optional a = C130836w.m213195a(fVar);
                        if (a.isEmpty()) {
                            ((C59052c) ((C59052c) C130820g.f358061a.mo56226d()).mo56372aa(38974)).mo56386p("Extracted alarm is empty.");
                        } else {
                            e.mo55395g((C51473j) a.get());
                        }
                    }
                } catch (C62974ct unused) {
                    ((C59052c) ((C59052c) C130820g.f358061a.mo56226d()).mo56372aa(38976)).mo56386p("Failed to parse Icing proto");
                }
            }
        }
        return e.mo55394f();
    }
}
