package androidx.p186q.p187a.p188a;

import android.database.sqlite.SQLiteProgram;
import androidx.p186q.p187a.C4055j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.a.a.n */
/* compiled from: PG */
public class C4045n implements C4055j {

    /* renamed from: a */
    public final SQLiteProgram f12930a;

    public C4045n(SQLiteProgram sQLiteProgram) {
        C69664n.m101061g(sQLiteProgram, "delegate");
        this.f12930a = sQLiteProgram;
    }

    /* renamed from: c */
    public final void mo8201c(int i, byte[] bArr) {
        C69664n.m101061g(bArr, "value");
        this.f12930a.bindBlob(i, bArr);
    }

    public final void close() {
        this.f12930a.close();
    }

    /* renamed from: d */
    public final void mo8203d(int i, double d) {
        this.f12930a.bindDouble(i, d);
    }

    /* renamed from: e */
    public final void mo8204e(int i, long j) {
        this.f12930a.bindLong(i, j);
    }

    /* renamed from: f */
    public final void mo8205f(int i) {
        this.f12930a.bindNull(i);
    }

    /* renamed from: g */
    public final void mo8206g(int i, String str) {
        C69664n.m101061g(str, "value");
        this.f12930a.bindString(i, str);
    }
}
