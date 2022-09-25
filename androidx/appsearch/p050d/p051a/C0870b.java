package androidx.appsearch.p050d.p051a;

import android.app.appsearch.GenericDocument;
import android.app.appsearch.Migrator;
import androidx.appsearch.p047a.C0858w;
import androidx.appsearch.p047a.C0860y;

/* renamed from: androidx.appsearch.d.a.b */
/* compiled from: PG */
public final class C0870b extends Migrator {

    /* renamed from: a */
    final /* synthetic */ C0860y f2937a;

    public C0870b(C0860y yVar) {
        this.f2937a = yVar;
    }

    public final GenericDocument onDowngrade(int i, int i2, GenericDocument genericDocument) {
        C0858w b = C0869a.m2756b(genericDocument);
        C0858w a = this.f2937a.mo3459a();
        if (b.equals(a)) {
            return genericDocument;
        }
        return C0869a.m2755a(a);
    }

    public final GenericDocument onUpgrade(int i, int i2, GenericDocument genericDocument) {
        C0858w b = C0869a.m2756b(genericDocument);
        C0858w b2 = this.f2937a.mo3460b();
        if (b.equals(b2)) {
            return genericDocument;
        }
        return C0869a.m2755a(b2);
    }

    public final boolean shouldMigrate(int i, int i2) {
        return this.f2937a.mo3461c();
    }
}
