package com.google.android.libraries.storage.p3315b;

import android.database.sqlite.SQLiteStatement;
import android.util.SparseIntArray;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import java.io.Closeable;

/* renamed from: com.google.android.libraries.storage.b.bd */
/* compiled from: PG */
public final class C42845bd implements Closeable {

    /* renamed from: a */
    private final C47558bi f112133a;

    /* renamed from: b */
    private final SQLiteStatement f112134b;

    /* renamed from: c */
    private final SparseIntArray f112135c = new SparseIntArray();

    /* renamed from: d */
    private boolean f112136d = false;

    public C42845bd(C42847bf bfVar, String str) {
        this.f112133a = C47831fm.m85024s("PREPARED ".concat(str));
        this.f112134b = bfVar.f112138b.compileStatement(str);
    }

    /* renamed from: e */
    private final void m75687e(int i) {
        if (this.f112135c.get(i) != 0) {
            throw new IllegalArgumentException("index already bound to existing statement");
        }
    }

    /* renamed from: a */
    public final void mo45923a(int i, byte[] bArr) {
        m75687e(i);
        this.f112134b.bindBlob(i, bArr);
        this.f112135c.put(i, i);
    }

    /* renamed from: b */
    public final void mo45924b(int i, long j) {
        m75687e(i);
        this.f112134b.bindLong(i, j);
        this.f112135c.put(i, i);
    }

    /* renamed from: c */
    public final void mo45925c(int i, String str) {
        m75687e(i);
        this.f112134b.bindString(i, str);
        this.f112135c.put(i, i);
    }

    public final void close() {
        if (!this.f112136d) {
            this.f112136d = true;
            try {
                this.f112134b.close();
            } finally {
                this.f112133a.close();
            }
        }
    }

    /* renamed from: d */
    public final void mo45927d() {
        this.f112134b.executeInsert();
        this.f112135c.clear();
        this.f112134b.clearBindings();
    }
}
