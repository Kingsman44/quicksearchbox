package com.google.android.p10890h.p10891a.p10892a;

import android.media.session.MediaSession;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.h.a.a.k */
/* compiled from: PG */
public abstract class C146556k implements C146554i {

    /* renamed from: a */
    private final MediaSessionCompat f395793a;

    /* renamed from: b */
    private final C2650bl f395794b = new C2650bl();

    /* renamed from: c */
    private long f395795c = -1;

    public C146556k(MediaSessionCompat mediaSessionCompat) {
        this.f395793a = mediaSessionCompat;
    }

    /* renamed from: i */
    private final void m238656i(C2646bh bhVar) {
        int i;
        int i2;
        int i3;
        C2646bh bhVar2 = bhVar;
        C2651bm u = bhVar.mo6014u();
        if (u.mo6304o()) {
            this.f395793a.mo877i(Collections.emptyList());
            this.f395795c = -1;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int min = Math.min(10, u.mo6022c());
        int c = bhVar.mo5996c();
        long j = (long) c;
        arrayDeque.add(new MediaSessionCompat.QueueItem((MediaSession.QueueItem) null, mo23162b(bhVar2, c), j));
        boolean P = bhVar.mo5988P();
        int i4 = c;
        while (true) {
            if (c == -1) {
                if (i4 == -1) {
                    break;
                }
                i = -1;
            } else {
                i = c;
            }
            if (arrayDeque.size() >= min) {
                break;
            }
            if (i4 != -1) {
                i4 = u.mo6299j(i4, 0, P);
                if (i4 != -1) {
                    i3 = i;
                    arrayDeque.add(new MediaSessionCompat.QueueItem((MediaSession.QueueItem) null, mo23162b(bhVar2, i4), (long) i4));
                } else {
                    i3 = i;
                }
                i2 = i3;
            } else {
                i2 = i;
            }
            if (!(i2 == -1 || arrayDeque.size() >= min || (c = u.mo6300k(i2, 0, P)) == -1)) {
                arrayDeque.addFirst(new MediaSessionCompat.QueueItem((MediaSession.QueueItem) null, mo23162b(bhVar2, c), (long) c));
            }
        }
        this.f395793a.mo877i(new ArrayList(arrayDeque));
        this.f395795c = j;
    }

    /* renamed from: a */
    public long mo115933a(C2646bh bhVar) {
        boolean z;
        boolean z2;
        C2651bm u = bhVar.mo6014u();
        long j = 0;
        boolean z3 = false;
        if (u.mo6304o() || bhVar.mo5989Q()) {
            z = false;
            z2 = false;
        } else {
            u.mo6024e(bhVar.mo5996c(), this.f395794b, 0);
            boolean z4 = u.mo6022c() > 1;
            z2 = bhVar.mo6272ar(5) || !this.f395794b.mo6292a() || bhVar.mo6272ar(6);
            if ((this.f395794b.mo6292a() && this.f395794b.f7344i) || bhVar.mo6272ar(8)) {
                z3 = true;
            }
            z = z3;
            z3 = z4;
        }
        if (true == z3) {
            j = 4096;
        }
        if (z2) {
            j |= 16;
        }
        return z ? 32 | j : j;
    }

    /* renamed from: b */
    public abstract MediaDescriptionCompat mo23162b(C2646bh bhVar, int i);

    /* renamed from: c */
    public void mo115934c(C2646bh bhVar) {
        bhVar.mo6265aj();
    }

    /* renamed from: d */
    public final void mo123337d(C2646bh bhVar) {
        if (this.f395795c == -1 || bhVar.mo6014u().mo6022c() > 10) {
            m238656i(bhVar);
        } else if (!bhVar.mo6014u().mo6304o()) {
            this.f395795c = (long) bhVar.mo5996c();
        }
    }

    /* renamed from: e */
    public final void mo123338e(C2646bh bhVar) {
        bhVar.mo6267al();
    }

    /* renamed from: f */
    public final void mo123339f(C2646bh bhVar, long j) {
        int i;
        C2651bm u = bhVar.mo6014u();
        if (!u.mo6304o() && !bhVar.mo5989Q() && (i = (int) j) >= 0 && i < u.mo6022c()) {
            bhVar.mo6264ai(i);
        }
    }

    /* renamed from: g */
    public final void mo123340g(C2646bh bhVar) {
        m238656i(bhVar);
    }

    /* renamed from: h */
    public final long mo123341h() {
        return this.f395795c;
    }

    /* renamed from: j */
    public final boolean mo23151j(C2646bh bhVar, String str) {
        return false;
    }
}
