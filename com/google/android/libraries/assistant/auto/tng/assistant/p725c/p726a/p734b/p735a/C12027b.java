package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.p735a;

import android.media.AudioTrack;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69685i;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.b.a.b */
/* compiled from: PG */
final class C12027b implements C2166e {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f38557a;

    /* renamed from: b */
    final /* synthetic */ C12032g f38558b;

    /* renamed from: c */
    final /* synthetic */ C69685i f38559c;

    public C12027b(AudioTrack audioTrack, C12032g gVar, C69685i iVar) {
        this.f38557a = audioTrack;
        this.f38558b = gVar;
        this.f38559c = iVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        try {
            AudioTrack audioTrack = this.f38557a;
            if (audioTrack == null) {
                return null;
            }
            C12032g gVar = this.f38558b;
            C69685i iVar = this.f38559c;
            gVar.f38569c.set(cVar);
            audioTrack.setPlaybackPositionUpdateListener(new C12033h(new C12026a(gVar, iVar), gVar.f38569c));
            gVar.f38568b.mo22352b((C37254c) iVar.f186052a);
            audioTrack.play();
            return audioTrack;
        } catch (Exception e) {
            C59052c cVar2 = (C59052c) ((C59052c) C12032g.f38566a.mo56226d()).mo56382g(e);
            cVar2.mo56379ah(new C59094n(43970));
            cVar2.mo56386p("Error playing earcon");
            return Boolean.valueOf(cVar.mo5439d(e));
        }
    }
}
