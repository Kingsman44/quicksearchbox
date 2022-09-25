package com.google.android.libraries.search.assistant.p2513e.p2514a;

import com.google.audio.hearing.common.OggOpusEncoder;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.audio.encoding.LibOggOpusEncoder$createEncoder$2", mo61344c = "LibOggOpusEncoder.kt", mo61345d = "invokeSuspend", mo61346e = {72})
/* renamed from: com.google.android.libraries.search.assistant.e.a.g */
/* compiled from: PG */
final class C32570g extends C69572j implements C69630p {

    /* renamed from: a */
    int f87218a;

    /* renamed from: b */
    final /* synthetic */ C32574k f87219b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32570g(C32574k kVar, C69577g gVar) {
        super(2, gVar);
        this.f87219b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32570g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87218a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32569f fVar = this.f87219b.f87232c;
            this.f87218a = 1;
            Object c = C71663i.m104690c(fVar.f87216b.mo50395b(), this);
            if (c != C69554a.COROUTINE_SUSPENDED) {
                c = C69788q.f186170a;
            }
            if (c == aVar) {
                return aVar;
            }
        }
        return new OggOpusEncoder();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32570g(this.f87219b, gVar);
    }
}
