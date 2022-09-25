package com.google.android.libraries.search.p2904c.p2942m.p2945c;

import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37640gs;
import com.google.android.libraries.search.p2904c.C37641gt;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.c.m.c.b */
/* compiled from: PG */
public final /* synthetic */ class C37879b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C37879b f100431a = new C37879b();

    private /* synthetic */ C37879b() {
    }

    public final Object apply(Object obj) {
        C37514du duVar = ((C37418bw) obj).f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a == 2) {
            C37512ds a = C37512ds.m66519a(((Integer) duVar.f99632b).intValue());
            if (a == null) {
                a = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            if (a == C37512ds.FAILED_CLOSING_AUDIO_RECORD_ERROR || a == C37512ds.FAILED_CLOSING_AUDIO_URI_STREAM_ERROR || a == C37512ds.FAILED_CLOSING_AUDIO_PFD_STREAM_ERROR) {
                C37640gs gsVar = (C37640gs) C37641gt.f100008c.createBuilder();
                gsVar.copyOnWrite();
                C37641gt gtVar = (C37641gt) gsVar.instance;
                gtVar.f100011b = 3;
                gtVar.f100010a |= 1;
                return (C37641gt) gsVar.build();
            }
        }
        C37640gs gsVar2 = (C37640gs) C37641gt.f100008c.createBuilder();
        gsVar2.copyOnWrite();
        C37641gt gtVar2 = (C37641gt) gsVar2.instance;
        gtVar2.f100011b = 2;
        gtVar2.f100010a |= 1;
        return (C37641gt) gsVar2.build();
    }
}
