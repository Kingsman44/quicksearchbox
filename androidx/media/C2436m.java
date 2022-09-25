package androidx.media;

import android.os.IBinder;
import java.util.HashMap;

/* renamed from: androidx.media.m */
/* compiled from: PG */
final class C2436m implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final String f6719a;

    /* renamed from: b */
    public final int f6720b;

    /* renamed from: c */
    public final int f6721c;

    /* renamed from: d */
    public final HashMap f6722d = new HashMap();

    /* renamed from: e */
    public C2434k f6723e;

    /* renamed from: f */
    final /* synthetic */ C2416an f6724f;

    /* renamed from: g */
    public final C2414al f6725g;

    public C2436m(C2416an anVar, String str, int i, int i2, C2414al alVar) {
        this.f6724f = anVar;
        this.f6719a = str;
        this.f6720b = i;
        this.f6721c = i2;
        new C2417ao(str, i, i2);
        this.f6725g = alVar;
    }

    public final void binderDied() {
        this.f6724f.f6688d.post(new C2435l(this));
    }
}
