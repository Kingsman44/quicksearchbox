package com.google.android.libraries.search.p2904c.p2929h.p2930a;

import android.media.AudioTrack;
import com.google.android.libraries.search.p2904c.C37628gg;
import com.google.android.libraries.search.p2904c.C37629gh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.c.h.a.a */
/* compiled from: PG */
final class C37650a extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C37629gh f100016a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37650a(C37629gh ghVar) {
        super(1);
        this.f100016a = ghVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        AudioTrack audioTrack = (AudioTrack) obj;
        C59052c cVar = (C59052c) C37652c.f100020a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.AudiotactileFdbkCt");
        C37628gg a = C37628gg.m66600a(this.f100016a.f99990b);
        if (a == null) {
            a = C37628gg.EVENT_UNDEFINED;
        }
        String name = a.name();
        cVar.mo56379ah(new C59094n(52754));
        cVar.mo56389s("#audio# end of feedback audio for resource(%s)", name);
        if (audioTrack != null) {
            audioTrack.release();
        }
        return C69788q.f186170a;
    }
}
