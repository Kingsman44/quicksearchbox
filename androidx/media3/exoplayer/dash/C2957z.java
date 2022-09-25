package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.dash.p141a.C2912c;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.extractor.metadata.emsg.C3590b;
import java.util.TreeMap;

/* renamed from: androidx.media3.exoplayer.dash.z */
/* compiled from: PG */
public final class C2957z implements Handler.Callback {

    /* renamed from: a */
    public final C3590b f8491a = new C3590b();

    /* renamed from: b */
    public final Handler f8492b = C2612ak.m6922E(this);

    /* renamed from: c */
    public final TreeMap f8493c = new TreeMap();

    /* renamed from: d */
    public C2912c f8494d;

    /* renamed from: e */
    public boolean f8495e;

    /* renamed from: f */
    public boolean f8496f;

    /* renamed from: g */
    public boolean f8497g;

    /* renamed from: h */
    public final C3241g f8498h;

    /* renamed from: i */
    public final C2941j f8499i;

    public C2957z(C2912c cVar, C2941j jVar, C3241g gVar) {
        this.f8494d = cVar;
        this.f8499i = jVar;
        this.f8498h = gVar;
    }

    /* renamed from: a */
    public final void mo6855a() {
        if (this.f8495e) {
            this.f8496f = true;
            this.f8495e = false;
            DashMediaSource dashMediaSource = this.f8499i.f8448a;
            dashMediaSource.f8281f.removeCallbacks(dashMediaSource.f8278c);
            dashMediaSource.mo6756l();
        }
    }

    public final boolean handleMessage(Message message) {
        if (this.f8497g) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C2955x xVar = (C2955x) message.obj;
        long j = xVar.f8484a;
        long j2 = xVar.f8485b;
        TreeMap treeMap = this.f8493c;
        Long valueOf = Long.valueOf(j2);
        Long l = (Long) treeMap.get(valueOf);
        if (l == null) {
            this.f8493c.put(valueOf, Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f8493c.put(valueOf, Long.valueOf(j));
        }
        return true;
    }
}
