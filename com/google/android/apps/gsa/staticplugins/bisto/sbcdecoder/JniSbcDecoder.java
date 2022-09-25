package com.google.android.apps.gsa.staticplugins.bisto.sbcdecoder;

import com.google.android.apps.gsa.shared.util.C90727ak;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.p10712d.C142368ct;
import com.google.android.p10712d.C142383dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public class JniSbcDecoder {

    /* renamed from: a */
    public static boolean f268437a;

    /* renamed from: b */
    public static final JniSbcDecoder f268438b = new JniSbcDecoder();

    /* renamed from: d */
    private static final C59071e f268439d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.sbcdecoder.JniSbcDecoder");

    /* renamed from: c */
    public final AtomicBoolean f268440c = new AtomicBoolean();

    /* renamed from: e */
    private C95871a f268441e;

    /* renamed from: f */
    private int f268442f;

    /* renamed from: g */
    private int f268443g;

    /* renamed from: h */
    private byte[] f268444h;

    /* renamed from: i */
    private int f268445i;

    public static native byte[] decodeFrame(byte[] bArr);

    public static native void initialDecoder(int i, int i2, int i3, int i4, int i5, int i6);

    /* renamed from: a */
    public final void mo89827a() {
        this.f268440c.set(false);
    }

    /* renamed from: c */
    public final byte[] mo89829c(byte[] bArr) {
        if (this.f268441e == null || !this.f268440c.get()) {
            C59104x d = f268439d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "JniSbcDecoder");
            ((C59052c) ((C59052c) d).mo56372aa(16739)).mo56386p("decodeSbcAudio when not decoding");
            int i = C90755l.f253831a;
            return new byte[0];
        }
        byte[] bArr2 = new byte[(((this.f268445i + bArr.length) / this.f268442f) * this.f268443g)];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return bArr2;
            }
            int min = Math.min(length - i2, this.f268442f - this.f268445i);
            System.arraycopy(bArr, i2, this.f268444h, this.f268445i, min);
            i2 += min;
            int i4 = this.f268445i + min;
            this.f268445i = i4;
            if (i4 == this.f268442f) {
                byte[] decodeFrame = decodeFrame(this.f268444h);
                this.f268445i = 0;
                System.arraycopy(decodeFrame, 0, bArr2, i3, this.f268443g);
                i3 += this.f268443g;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo89828b(C142383dh dhVar) {
        C95871a aVar = new C95871a();
        if (dhVar.f386359d) {
            C59104x c = f268439d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JniSbcDecoder");
            ((C59052c) ((C59052c) c).mo56372aa(16736)).mo56386p("Cannot decode stereo audio. Only support mono now.");
            return false;
        }
        int i = dhVar.f386360e;
        int a = C142368ct.m231069a(dhVar.f386364i);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        int i3 = dhVar.f386361f;
        int i4 = dhVar.f386362g;
        int i5 = dhVar.f386363h;
        if (this.f268440c.getAndSet(true)) {
            C59104x c2 = f268439d.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "JniSbcDecoder");
            ((C59052c) ((C59052c) c2).mo56372aa(16738)).mo56386p("Cannot decode two audio streams at the same time.");
            return false;
        }
        this.f268441e = aVar;
        if (!f268437a) {
            C90727ak.m148184a("sbcdecoder_jni");
            f268437a = true;
        }
        int i6 = ((i3 * 4) / 8) + (((i4 * i5) + 7) / 8);
        this.f268442f = i6;
        int i7 = i3 * i4;
        int i8 = i7 + i7;
        this.f268443g = i8;
        this.f268444h = new byte[i6];
        this.f268445i = 0;
        initialDecoder(i2, i4, i3, i5, i6, i8);
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }
}
