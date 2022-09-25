package androidx.p186q.p187a.p188a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.p186q.p187a.C4031a;
import androidx.p186q.p187a.C4047b;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4056k;
import androidx.p186q.p187a.C4057l;
import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.q.a.a.d */
/* compiled from: PG */
public final class C4035d implements C4049d {

    /* renamed from: b */
    public static final /* synthetic */ int f12899b = 0;

    /* renamed from: c */
    private static final String[] f12900c = {BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d */
    private static final String[] f12901d = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f12902a;

    public C4035d(SQLiteDatabase sQLiteDatabase) {
        C69664n.m101061g(sQLiteDatabase, "delegate");
        this.f12902a = sQLiteDatabase;
    }

    /* renamed from: a */
    public final Cursor mo8241a(C4056k kVar) {
        C69664n.m101061g(kVar, "supportQuery");
        Cursor rawQueryWithFactory = this.f12902a.rawQueryWithFactory(new C4033b(new C4034c(kVar)), kVar.mo8199a(), f12901d, (String) null);
        C69664n.m101060f(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    /* renamed from: b */
    public final Cursor mo8242b(String str) {
        return mo8241a(new C4047b(str, (Object[]) null));
    }

    /* renamed from: c */
    public final Cursor mo8243c(C4056k kVar, CancellationSignal cancellationSignal) {
        C69664n.m101061g(kVar, "supportQuery");
        SQLiteDatabase sQLiteDatabase = this.f12902a;
        String a = kVar.mo8199a();
        String[] strArr = f12901d;
        C4032a aVar = new C4032a(kVar);
        C69664n.m101061g(sQLiteDatabase, "sQLiteDatabase");
        C69664n.m101061g(a, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, a, strArr, (String) null, cancellationSignal);
        C69664n.m101060f(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public final void close() {
        this.f12902a.close();
    }

    /* renamed from: d */
    public final C4057l mo8245d(String str) {
        C69664n.m101061g(str, "sql");
        SQLiteStatement compileStatement = this.f12902a.compileStatement(str);
        C69664n.m101060f(compileStatement, "delegate.compileStatement(sql)");
        return new C4046o(compileStatement);
    }

    /* renamed from: e */
    public final void mo8246e() {
        this.f12902a.beginTransaction();
    }

    /* renamed from: f */
    public final void mo8247f() {
        this.f12902a.beginTransactionNonExclusive();
    }

    /* renamed from: g */
    public final void mo8248g() {
        this.f12902a.endTransaction();
    }

    /* renamed from: h */
    public final void mo8249h(String str) {
        this.f12902a.execSQL(str);
    }

    /* renamed from: i */
    public final void mo8250i() {
        this.f12902a.setTransactionSuccessful();
    }

    /* renamed from: j */
    public final boolean mo8251j() {
        return this.f12902a.inTransaction();
    }

    /* renamed from: k */
    public final boolean mo8252k() {
        return this.f12902a.isOpen();
    }

    /* renamed from: l */
    public final boolean mo8253l() {
        SQLiteDatabase sQLiteDatabase = this.f12902a;
        C69664n.m101061g(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: m */
    public final void mo8254m(Object[] objArr) {
        this.f12902a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    /* renamed from: n */
    public final void mo8255n(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(f12900c[i]);
            sb.append(str);
            sb.append(" SET ");
            int i2 = 0;
            for (String next : contentValues.keySet()) {
                sb.append(i2 > 0 ? "," : BuildConfig.FLAVOR);
                sb.append(next);
                objArr2[i2] = contentValues.get(next);
                sb.append("=?");
                i2++;
            }
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            C4057l d = mo8245d(sb.toString());
            C4031a.m11550a(d, objArr2);
            ((C4046o) d).f12931b.executeUpdateDelete();
            return;
        }
        throw new IllegalArgumentException("Empty values");
    }
}
