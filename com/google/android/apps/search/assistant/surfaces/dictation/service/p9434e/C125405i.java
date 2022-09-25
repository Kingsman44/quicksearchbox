package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.i */
/* compiled from: PG */
public final /* synthetic */ class C125405i implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C125405i f345853a = new C125405i();

    private /* synthetic */ C125405i() {
    }

    public final void accept(Object obj) {
        C37512ds dsVar;
        C37418bw bwVar = (C37418bw) obj;
        C37514du duVar = bwVar.f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a == 2) {
            C59052c cVar = (C59052c) ((C59052c) C125411o.f345861a.mo56226d()).mo56372aa(36500);
            C37514du duVar2 = bwVar.f99354b;
            if (duVar2 == null) {
                duVar2 = C37514du.f99629c;
            }
            if (duVar2.f99631a == 2) {
                dsVar = C37512ds.m66519a(((Integer) duVar2.f99632b).intValue());
                if (dsVar == null) {
                    dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
                }
            } else {
                dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            C69664n.m101061g(dsVar, "<this>");
            cVar.mo56389s("Failed to stop audio session with %s [SD]", C126290c.m206496a(Integer.valueOf(dsVar.f99628K)));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
