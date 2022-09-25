package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.appsearch.p053e.C0880a;
import androidx.appsearch.p053e.C0881b;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.appsearch.a.o */
/* compiled from: PG */
public class C0850o {

    /* renamed from: a */
    final Bundle f2833a;

    /* renamed from: b */
    private Integer f2834b;

    public C0850o(Bundle bundle) {
        bundle.getClass();
        this.f2833a = bundle;
    }

    /* renamed from: c */
    public final int mo3404c() {
        return this.f2833a.getInt("cardinality", 2);
    }

    /* renamed from: d */
    public final int mo3405d() {
        return this.f2833a.getInt("dataType", -1);
    }

    /* renamed from: e */
    public final String mo3406e() {
        return this.f2833a.getString("name", BuildConfig.FLAVOR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0850o)) {
            return false;
        }
        return C0880a.m2763b(this.f2833a, ((C0850o) obj).f2833a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo3408f(C0881b bVar) {
        bVar.mo3490a("{\n");
        bVar.mo3492c();
        bVar.mo3490a("name: \"");
        bVar.mo3490a(mo3406e());
        bVar.mo3490a("\",\n");
        if (this instanceof C0852q) {
            C0852q qVar = (C0852q) this;
            int a = qVar.mo3415a();
            if (a == 0) {
                bVar.mo3490a("indexingType: INDEXING_TYPE_NONE,\n");
            } else if (a == 1) {
                bVar.mo3490a("indexingType: INDEXING_TYPE_EXACT_TERMS,\n");
            } else if (a != 2) {
                bVar.mo3490a("indexingType: INDEXING_TYPE_UNKNOWN,\n");
            } else {
                bVar.mo3490a("indexingType: INDEXING_TYPE_PREFIXES,\n");
            }
            int b = qVar.mo3416b();
            if (b == 0) {
                bVar.mo3490a("tokenizerType: TOKENIZER_TYPE_NONE,\n");
            } else if (b != 1) {
                bVar.mo3490a("tokenizerType: TOKENIZER_TYPE_UNKNOWN,\n");
            } else {
                bVar.mo3490a("tokenizerType: TOKENIZER_TYPE_PLAIN,\n");
            }
        } else if (this instanceof C0846k) {
            C0846k kVar = (C0846k) this;
            bVar.mo3490a("shouldIndexNestedProperties: ");
            bVar.mo3490a(Boolean.valueOf(kVar.mo3401b()).toString());
            bVar.mo3490a(",\n");
            bVar.mo3490a("schemaType: \"");
            bVar.mo3490a(kVar.mo3400a());
            bVar.mo3490a("\",\n");
        }
        int c = mo3404c();
        if (c == 1) {
            bVar.mo3490a("cardinality: CARDINALITY_REPEATED,\n");
        } else if (c == 2) {
            bVar.mo3490a("cardinality: CARDINALITY_OPTIONAL,\n");
        } else if (c != 3) {
            bVar.mo3490a("cardinality: CARDINALITY_UNKNOWN,\n");
        } else {
            bVar.mo3490a("cardinality: CARDINALITY_REQUIRED,\n");
        }
        switch (mo3405d()) {
            case 1:
                bVar.mo3490a("dataType: DATA_TYPE_STRING,\n");
                break;
            case 2:
                bVar.mo3490a("dataType: DATA_TYPE_LONG,\n");
                break;
            case 3:
                bVar.mo3490a("dataType: DATA_TYPE_DOUBLE,\n");
                break;
            case 4:
                bVar.mo3490a("dataType: DATA_TYPE_BOOLEAN,\n");
                break;
            case 5:
                bVar.mo3490a("dataType: DATA_TYPE_BYTES,\n");
                break;
            case 6:
                bVar.mo3490a("dataType: DATA_TYPE_DOCUMENT,\n");
                break;
            default:
                bVar.mo3490a("dataType: DATA_TYPE_UNKNOWN,\n");
                break;
        }
        bVar.mo3491b();
        bVar.mo3490a("}");
    }

    public final int hashCode() {
        if (this.f2834b == null) {
            this.f2834b = Integer.valueOf(C0880a.m2762a(this.f2833a));
        }
        return this.f2834b.intValue();
    }

    public final String toString() {
        C0881b bVar = new C0881b();
        mo3408f(bVar);
        return bVar.f2953a.toString();
    }
}
