package androidx.appsearch.p047a;

import android.os.Bundle;
import androidx.core.p097i.C1974i;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.appsearch.a.ah */
/* compiled from: PG */
public final class C0835ah {

    /* renamed from: a */
    private final Bundle f2813a;

    public C0835ah(String str, String str2, String str3, C0838c cVar) {
        Bundle bundle = new Bundle();
        this.f2813a = bundle;
        str.getClass();
        bundle.putString("namespace", str);
        str2.getClass();
        bundle.putString("id", str2);
        str3.getClass();
        bundle.putString("schemaType", str3);
        C1974i.m5314b(!cVar.mo3387c(), "failedResult was actually successful");
        bundle.putString("errorMessage", cVar.f2818c);
        bundle.putInt("resultCode", cVar.f2816a);
    }

    public final String toString() {
        return "MigrationFailure { schemaType: " + this.f2813a.getString("schemaType", BuildConfig.FLAVOR) + ", namespace: " + this.f2813a.getString("namespace", BuildConfig.FLAVOR) + ", documentId: " + this.f2813a.getString("id", BuildConfig.FLAVOR) + ", appSearchResult: " + new C0838c(this.f2813a.getInt("resultCode"), (Object) null, this.f2813a.getString("errorMessage", BuildConfig.FLAVOR)).toString() + "}";
    }
}
