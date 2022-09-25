package com.google.android.p10890h.p10891a.p10892a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p031v4.media.C0329x;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0298ao;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2591ar;
import androidx.media3.common.C2646bh;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.h.a.a.j */
/* compiled from: PG */
public final class C146555j {

    /* renamed from: a */
    public static final MediaMetadataCompat f395775a = new C0329x().mo1090a();

    /* renamed from: b */
    public final MediaSessionCompat f395776b;

    /* renamed from: c */
    public final ArrayList f395777c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f395778d = new ArrayList();

    /* renamed from: e */
    public Map f395779e = Collections.emptyMap();

    /* renamed from: f */
    public C146552g f395780f;

    /* renamed from: g */
    public C2646bh f395781g;

    /* renamed from: h */
    public C146553h f395782h;

    /* renamed from: i */
    public C146554i f395783i;

    /* renamed from: j */
    public C146550e f395784j;

    /* renamed from: k */
    public boolean f395785k;

    /* renamed from: l */
    public boolean f395786l;

    /* renamed from: m */
    public boolean f395787m;

    /* renamed from: n */
    public boolean f395788n;

    /* renamed from: o */
    private final Looper f395789o;

    /* renamed from: p */
    private final C146547b f395790p;

    /* renamed from: q */
    private C146548c[] f395791q = new C146548c[0];

    /* renamed from: r */
    private final long f395792r;

    static {
        C2591ar.m6797b("goog.exo.mediasession");
    }

    public C146555j(MediaSessionCompat mediaSessionCompat) {
        this.f395776b = mediaSessionCompat;
        Looper F = C2612ak.m6923F();
        this.f395789o = F;
        C146547b bVar = new C146547b(this);
        this.f395790p = bVar;
        this.f395780f = new C146549d(mediaSessionCompat.f983c);
        this.f395792r = 2360143;
        mediaSessionCompat.mo881m();
        mediaSessionCompat.mo873e(bVar, new Handler(F));
        this.f395787m = true;
    }

    /* renamed from: j */
    private final long m238644j() {
        C146553h hVar = this.f395782h;
        if (hVar == null) {
            return 0;
        }
        return hVar.mo23146a() & 257024;
    }

    /* renamed from: k */
    private final void m238645k(C146546a aVar) {
        if (aVar != null && !this.f395777c.contains(aVar)) {
            this.f395777c.add(aVar);
        }
    }

    /* renamed from: l */
    private final void m238646l(C146546a aVar) {
        if (aVar != null) {
            this.f395777c.remove(aVar);
        }
    }

    /* renamed from: a */
    public final void mo123342a() {
        MediaMetadataCompat mediaMetadataCompat;
        MediaMetadataCompat d;
        C2646bh bhVar;
        C146552g gVar = this.f395780f;
        if (gVar == null || (bhVar = this.f395781g) == null) {
            mediaMetadataCompat = f395775a;
        } else {
            mediaMetadataCompat = gVar.mo115931a(bhVar);
        }
        C146552g gVar2 = this.f395780f;
        if (!this.f395785k || gVar2 == null || (d = this.f395776b.f983c.mo1036d()) == null || !gVar2.mo115932b(d, mediaMetadataCompat)) {
            this.f395776b.mo875g(mediaMetadataCompat);
        }
    }

    /* renamed from: b */
    public final void mo123343b() {
        int i;
        C0298ao aoVar = new C0298ao();
        C2646bh bhVar = this.f395781g;
        int i2 = 0;
        if (bhVar == null) {
            aoVar.f1025b = m238644j();
            aoVar.mo984c(0, 0, 0.0f, SystemClock.elapsedRealtime());
            this.f395776b.mo878j(0);
            this.f395776b.mo880l(0);
            this.f395776b.mo876h(aoVar.mo982a());
            return;
        }
        HashMap hashMap = new HashMap();
        for (C146548c cVar : this.f395791q) {
            PlaybackStateCompat.CustomAction a = cVar.mo115922a();
            if (a != null) {
                hashMap.put(a.f1006a, cVar);
                aoVar.mo983b(a);
            }
        }
        this.f395779e = Collections.unmodifiableMap(hashMap);
        Bundle bundle = new Bundle();
        if (bhVar.mo6011r() == null) {
            int e = bhVar.mo5998e();
            boolean O = bhVar.mo5987O();
            if (e != 2) {
                if (e != 3) {
                    i = (e == 4 || this.f395788n) ? 1 : 0;
                } else if (O) {
                    i = 3;
                }
            } else if (O) {
                i = 6;
            }
            i = 2;
        } else {
            i = 7;
        }
        C146554i iVar = this.f395783i;
        long h = iVar != null ? iVar.mo123341h() : -1;
        float f = bhVar.mo6012s().f7313b;
        bundle.putFloat("EXO_SPEED", f);
        float f2 = true != bhVar.mo6277aw() ? 0.0f : f;
        C2590aq aa = bhVar.mo6256aa();
        if (aa != null && !BuildConfig.FLAVOR.equals(aa.f7153b)) {
            bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", aa.f7153b);
        }
        long j = m238644j();
        boolean ar = bhVar.mo6272ar(5);
        boolean ar2 = bhVar.mo6272ar(11);
        boolean ar3 = bhVar.mo6272ar(12);
        if (!bhVar.mo6014u().mo6304o()) {
            bhVar.mo5989Q();
        }
        long j2 = true != ar ? 6554119 : 6554375;
        if (ar3) {
            j2 |= 64;
        }
        if (ar2) {
            j2 |= 8;
        }
        long j3 = j2 & this.f395792r;
        C146554i iVar2 = this.f395783i;
        if (iVar2 != null) {
            j3 |= iVar2.mo115933a(bhVar) & 4144;
        }
        aoVar.f1025b = j | j3;
        aoVar.f1028e = h;
        aoVar.f1024a = bhVar.mo6001h();
        aoVar.mo984c(i, bhVar.mo6004k(), f2, SystemClock.elapsedRealtime());
        aoVar.f1029f = bundle;
        int g = bhVar.mo6000g();
        MediaSessionCompat mediaSessionCompat = this.f395776b;
        if (g == 1) {
            i2 = 1;
        } else if (g == 2) {
            i2 = 2;
        }
        mediaSessionCompat.mo878j(i2);
        this.f395776b.mo880l(bhVar.mo5988P() ? 1 : 0);
        this.f395776b.mo876h(aoVar.mo982a());
    }

    /* renamed from: c */
    public final void mo123344c(C146548c... cVarArr) {
        if (cVarArr == null) {
            cVarArr = new C146548c[0];
        }
        this.f395791q = cVarArr;
        mo123343b();
    }

    /* renamed from: d */
    public final void mo123345d(C146553h hVar) {
        C146553h hVar2 = this.f395782h;
        if (hVar2 != hVar) {
            m238646l(hVar2);
            this.f395782h = hVar;
            m238645k(hVar);
            mo123343b();
        }
    }

    /* renamed from: e */
    public final void mo123346e(C2646bh bhVar) {
        boolean z = true;
        if (!(bhVar == null || bhVar.mo6009p() == this.f395789o)) {
            z = false;
        }
        C2601a.m6830b(z);
        C2646bh bhVar2 = this.f395781g;
        if (bhVar2 != null) {
            bhVar2.mo6019z(this.f395790p);
        }
        this.f395781g = bhVar;
        if (bhVar != null) {
            bhVar.mo6016w(this.f395790p);
        }
        mo123343b();
        mo123342a();
    }

    /* renamed from: f */
    public final void mo123347f(C146554i iVar) {
        C146554i iVar2 = this.f395783i;
        if (iVar2 != iVar) {
            m238646l(iVar2);
            this.f395783i = iVar;
            m238645k(iVar);
        }
    }

    /* renamed from: g */
    public final boolean mo123348g(long j) {
        if (this.f395781g != null) {
            return (j & this.f395792r) != 0 || this.f395786l;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo123349h(long j) {
        C146553h hVar = this.f395782h;
        if (hVar != null) {
            return (j & hVar.mo23146a()) != 0 || this.f395786l;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo123350i(long j) {
        C146554i iVar;
        C2646bh bhVar = this.f395781g;
        if (bhVar == null || (iVar = this.f395783i) == null) {
            return false;
        }
        return (j & iVar.mo115933a(bhVar)) != 0 || this.f395786l;
    }
}
