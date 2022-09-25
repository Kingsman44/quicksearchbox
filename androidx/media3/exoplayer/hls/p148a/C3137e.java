package androidx.media3.exoplayer.hls.p148a;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.hls.C3163c;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3065bc;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3248n;
import androidx.media3.exoplayer.p151k.C3249o;
import androidx.media3.exoplayer.p151k.C3250p;
import androidx.media3.exoplayer.p151k.C3252r;
import androidx.media3.exoplayer.p151k.C3256v;
import androidx.media3.exoplayer.p151k.C3259y;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2510n;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.exoplayer.hls.a.e */
/* compiled from: PG */
public final class C3137e implements C3157y, C3249o {

    /* renamed from: a */
    public final C3152t f9238a;

    /* renamed from: b */
    public final HashMap f9239b = new HashMap();

    /* renamed from: c */
    public final CopyOnWriteArrayList f9240c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public C3065bc f9241d;

    /* renamed from: e */
    public C3256v f9242e;

    /* renamed from: f */
    public Handler f9243f;

    /* renamed from: g */
    public C3156x f9244g;

    /* renamed from: h */
    public C3147o f9245h;

    /* renamed from: i */
    public Uri f9246i;

    /* renamed from: j */
    public C3144l f9247j;

    /* renamed from: k */
    public boolean f9248k;

    /* renamed from: l */
    public long f9249l = -9223372036854775807L;

    /* renamed from: m */
    public final C3163c f9250m;

    public C3137e(C3163c cVar, C3152t tVar) {
        this.f9250m = cVar;
        this.f9238a = tVar;
    }

    /* renamed from: e */
    public static C3141i m9172e(C3144l lVar, C3144l lVar2) {
        int i = (int) (lVar2.f9282h - lVar.f9282h);
        List list = lVar.f9289o;
        if (i < list.size()) {
            return (C3141i) list.get(i);
        }
        return null;
    }

    /* renamed from: d */
    public final Uri mo7142d(Uri uri) {
        C3140h hVar;
        C3144l lVar = this.f9247j;
        if (lVar == null || !lVar.f9293s.f9274e || (hVar = (C3140h) lVar.f9291q.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f9255b));
        int i = hVar.f9256c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    /* renamed from: eX */
    public final /* bridge */ /* synthetic */ void mo6825eX(C3252r rVar, boolean z) {
        C3259y yVar = (C3259y) rVar;
        long j = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        this.f9241d.mo7005d(new C3027aj(nVar, (byte[]) null), 4);
    }

    /* renamed from: f */
    public final C3144l mo7143f(Uri uri, boolean z) {
        C3144l lVar = ((C3136d) this.f9239b.get(uri)).f9229c;
        if (lVar != null && z && !uri.equals(this.f9246i)) {
            List list = this.f9245h.f9305c;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(((C3146n) list.get(i)).f9297a)) {
                    C3144l lVar2 = this.f9247j;
                    if (lVar2 == null || !lVar2.f9286l) {
                        this.f9246i = uri;
                        C3136d dVar = (C3136d) this.f9239b.get(uri);
                        C3144l lVar3 = dVar.f9229c;
                        if (lVar3 == null || !lVar3.f9286l) {
                            dVar.mo7139e(mo7142d(uri));
                        } else {
                            this.f9247j = lVar3;
                            this.f9244g.mo7122b(lVar3);
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return lVar;
    }

    /* renamed from: fb */
    public final /* bridge */ /* synthetic */ void mo6826fb(C3252r rVar, long j, long j2) {
        C3147o oVar;
        C3259y yVar = (C3259y) rVar;
        C3148p pVar = (C3148p) yVar.f9795e;
        boolean z = pVar instanceof C3144l;
        if (z) {
            oVar = C3147o.m9184a(pVar.f9314t);
        } else {
            oVar = (C3147o) pVar;
        }
        this.f9245h = oVar;
        this.f9246i = ((C3146n) oVar.f9305c.get(0)).f9297a;
        this.f9240c.add(new C3134b(this));
        List list = oVar.f9304b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.f9239b.put(uri, new C3136d(this, uri));
        }
        long j3 = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        C3027aj ajVar = new C3027aj(nVar, (byte[]) null);
        C3136d dVar = (C3136d) this.f9239b.get(this.f9246i);
        if (z) {
            dVar.mo7141g((C3144l) pVar);
        } else {
            dVar.mo7139e(dVar.f9227a);
        }
        long j4 = yVar.f9791a;
        this.f9241d.mo7007f(ajVar, 4);
    }

    /* renamed from: fe */
    public final /* bridge */ /* synthetic */ C3250p mo6827fe(C3252r rVar, IOException iOException, int i) {
        C3259y yVar = (C3259y) rVar;
        long j = yVar.f9791a;
        C2510n nVar = yVar.f9792b;
        C2493al alVar = yVar.f9794d;
        C3027aj ajVar = new C3027aj(nVar, (byte[]) null);
        int i2 = yVar.f9793c;
        long c = C3245k.m9468c(new C3248n(iOException, i));
        boolean z = c == -9223372036854775807L;
        this.f9241d.mo7009h(ajVar, yVar.f9793c, iOException, z);
        if (!z) {
            return new C3250p(0, c);
        }
        long j2 = yVar.f9791a;
        return C3256v.f9787c;
    }

    /* renamed from: g */
    public final void mo7144g(Uri uri) {
        C3136d dVar = (C3136d) this.f9239b.get(uri);
        dVar.f9228b.mo7250c(LinearLayoutManager.INVALID_OFFSET);
        IOException iOException = dVar.f9233g;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* renamed from: h */
    public final boolean mo7145h(Uri uri) {
        int i;
        C3136d dVar = (C3136d) this.f9239b.get(uri);
        if (dVar.f9229c == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000, C2612ak.m6918A(dVar.f9229c.f9292r));
        C3144l lVar = dVar.f9229c;
        if (lVar.f9286l || (i = lVar.f9275a) == 2 || i == 1 || dVar.f9230d + max > elapsedRealtime) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo7146i(Uri uri, C3248n nVar, boolean z) {
        Iterator it = this.f9240c.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !((C3153u) it.next()).mo7136q(uri, nVar, z);
        }
        return z2;
    }
}
