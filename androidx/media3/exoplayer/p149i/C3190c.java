package androidx.media3.exoplayer.p149i;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2615c;
import androidx.media3.extractor.p163j.C3486d;
import androidx.media3.extractor.p163j.C3496f;
import androidx.media3.extractor.p163j.C3508g;
import com.google.android.setupcompat.p3549a.C45240c;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* renamed from: androidx.media3.exoplayer.i.c */
/* compiled from: PG */
public final class C3190c implements C3486d {

    /* renamed from: a */
    public final Deque f9542a = new ArrayDeque();

    /* renamed from: b */
    private final C3496f f9543b = new C3496f();

    /* renamed from: c */
    private int f9544c;

    /* renamed from: d */
    private boolean f9545d;

    public C3190c() {
        for (int i = 0; i < 2; i++) {
            this.f9542a.addFirst(new C3188a(this));
        }
        this.f9544c = 0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5955a() {
        C2601a.m6832d(!this.f9545d);
        if (this.f9544c != 0) {
            return null;
        }
        this.f9544c = 1;
        return this.f9543b;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo5956b() {
        C2601a.m6832d(!this.f9545d);
        if (this.f9544c != 2 || this.f9542a.isEmpty()) {
            return null;
        }
        C3508g gVar = (C3508g) this.f9542a.removeFirst();
        C3496f fVar = this.f9543b;
        if (fVar.mo5954fh(4)) {
            gVar.f6941a |= 4;
        } else {
            long j = fVar.f6957e;
            ByteBuffer byteBuffer = fVar.f6955c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList(C45240c.f118157a);
            parcelableArrayList.getClass();
            gVar.mo7447e(this.f9543b.f6957e, new C3189b(j, C2615c.m7010a(C2567c.f7083b, parcelableArrayList)), 0);
        }
        this.f9543b.mo5953fg();
        this.f9544c = 0;
        return gVar;
    }

    /* renamed from: c */
    public final void mo5957c() {
        C2601a.m6832d(!this.f9545d);
        this.f9543b.mo5953fg();
        this.f9544c = 0;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5958d(Object obj) {
        boolean z = true;
        C2601a.m6832d(!this.f9545d);
        C2601a.m6832d(this.f9544c == 1);
        if (this.f9543b != obj) {
            z = false;
        }
        C2601a.m6830b(z);
        this.f9544c = 2;
    }

    /* renamed from: e */
    public final void mo5959e() {
        this.f9545d = true;
    }

    /* renamed from: r */
    public final void mo7197r(long j) {
    }
}
