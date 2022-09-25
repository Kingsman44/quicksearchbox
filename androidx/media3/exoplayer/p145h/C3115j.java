package androidx.media3.exoplayer.p145h;

import android.os.Handler;
import androidx.media3.common.C2651bm;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.p132b.C2495an;
import java.util.HashMap;

/* renamed from: androidx.media3.exoplayer.h.j */
/* compiled from: PG */
public abstract class C3115j extends C3005a {

    /* renamed from: a */
    private final HashMap f9131a = new HashMap();

    /* renamed from: b */
    private Handler f9132b;

    /* renamed from: c */
    private C2495an f9133c;

    protected C3115j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo7101b(Object obj, int i) {
        return i;
    }

    /* renamed from: c */
    public void mo6747c() {
        for (C3114i iVar : this.f9131a.values()) {
            iVar.f9128a.mo6747c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C3036as mo6963d(Object obj, C3036as asVar) {
        return asVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo7102e(Object obj) {
        C3114i iVar = (C3114i) this.f9131a.get(obj);
        iVar.getClass();
        iVar.f9128a.mo6947t(iVar.f9129b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo6750f(C2495an anVar) {
        this.f9133c = anVar;
        this.f9132b = C2612ak.m6922E((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo7103g(Object obj) {
        C3114i iVar = (C3114i) this.f9131a.get(obj);
        iVar.getClass();
        iVar.f9128a.mo6949v(iVar.f9129b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6753i() {
        for (C3114i iVar : this.f9131a.values()) {
            iVar.f9128a.mo6953z(iVar.f9129b);
            iVar.f9128a.mo6939B(iVar.f9130c);
            iVar.f9128a.mo6938A(iVar.f9130c);
        }
        this.f9131a.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo6964j(Object obj, C3038au auVar, C2651bm bmVar);

    /* renamed from: k */
    public final void mo7104k(Object obj, C3038au auVar) {
        C2601a.m6830b(!this.f9131a.containsKey(obj));
        C3112g gVar = new C3112g(this, obj);
        C3113h hVar = new C3113h(this, obj);
        this.f9131a.put(obj, new C3114i(auVar, gVar, hVar));
        Handler handler = this.f9132b;
        handler.getClass();
        auVar.mo6946s(handler, hVar);
        Handler handler2 = this.f9132b;
        handler2.getClass();
        auVar.mo6945r(handler2, hVar);
        C2495an anVar = this.f9133c;
        C2731bt btVar = this.f8712q;
        C2601a.m6829a(btVar);
        auVar.mo6951x(gVar, anVar, btVar);
        if (!mo6940C()) {
            auVar.mo6947t(gVar);
        }
    }

    /* renamed from: l */
    public final void mo7105l(Object obj) {
        C3114i iVar = (C3114i) this.f9131a.remove(obj);
        iVar.getClass();
        iVar.f9128a.mo6953z(iVar.f9129b);
        iVar.f9128a.mo6939B(iVar.f9130c);
        iVar.f9128a.mo6938A(iVar.f9130c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo6948u() {
        for (C3114i iVar : this.f9131a.values()) {
            iVar.f9128a.mo6947t(iVar.f9129b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo6950w() {
        for (C3114i iVar : this.f9131a.values()) {
            iVar.f9128a.mo6949v(iVar.f9129b);
        }
    }
}
