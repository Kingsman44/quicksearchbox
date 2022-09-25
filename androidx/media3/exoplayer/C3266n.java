package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.p138b.C2787ad;
import androidx.media3.exoplayer.p138b.C2796am;
import androidx.media3.exoplayer.p138b.C2800aq;
import androidx.media3.exoplayer.p138b.C2806b;
import androidx.media3.exoplayer.p142e.C2983m;
import androidx.media3.exoplayer.p142e.C2994x;
import androidx.media3.exoplayer.p143f.C2999b;
import androidx.media3.exoplayer.p143f.C3000c;
import androidx.media3.exoplayer.p149i.C3191d;
import androidx.media3.exoplayer.video.C3298e;
import androidx.media3.exoplayer.video.p153a.C3277b;
import java.util.ArrayList;

/* renamed from: androidx.media3.exoplayer.n */
/* compiled from: PG */
public final class C3266n implements C2896cy {

    /* renamed from: a */
    private final Context f9809a;

    /* renamed from: b */
    private final C2983m f9810b = new C2983m();

    /* renamed from: c */
    private final C2994x f9811c = C2994x.f8658b;

    public C3266n(Context context) {
        this.f9809a = context;
    }

    /* renamed from: a */
    public final C2893cv[] mo6704a(Handler handler, C2845bo boVar, C2845bo boVar2, C2845bo boVar3, C2845bo boVar4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3298e(this.f9809a, this.f9810b, this.f9811c, handler, boVar));
        Context context = this.f9809a;
        C2787ad adVar = new C2787ad();
        C2806b b = C2806b.m7751b(context);
        b.getClass();
        adVar.f7696a = b;
        C2796am a = adVar.mo6475a();
        arrayList.add(new C2800aq(this.f9809a, this.f9810b, this.f9811c, handler, boVar2, a));
        arrayList.add(new C3191d(boVar3, handler.getLooper()));
        arrayList.add(new C3000c(boVar4, handler.getLooper(), C2999b.f8669a));
        arrayList.add(new C3277b());
        return (C2893cv[]) arrayList.toArray(new C2893cv[0]);
    }
}
