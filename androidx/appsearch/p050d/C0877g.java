package androidx.appsearch.p050d;

import android.app.appsearch.AppSearchResult;
import android.app.appsearch.SetSchemaResponse;
import android.os.Bundle;
import androidx.appsearch.p047a.C0834ag;
import androidx.appsearch.p047a.C0835ah;
import androidx.appsearch.p047a.C0836ai;
import androidx.appsearch.p047a.C0838c;
import androidx.appsearch.p048b.C0862a;
import androidx.p104d.p105a.C2170i;
import java.util.Set;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;

/* renamed from: androidx.appsearch.d.g */
/* compiled from: PG */
public final /* synthetic */ class C0877g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2170i f2949a;

    public /* synthetic */ C0877g(C2170i iVar) {
        this.f2949a = iVar;
    }

    public final void accept(Object obj) {
        C0838c cVar;
        C2170i iVar = this.f2949a;
        AppSearchResult appSearchResult = (AppSearchResult) obj;
        int i = C0878h.f2950a;
        appSearchResult.getClass();
        if (appSearchResult.isSuccess()) {
            try {
                SetSchemaResponse setSchemaResponse = (SetSchemaResponse) appSearchResult.getResultValue();
                setSchemaResponse.getClass();
                C0834ag agVar = new C0834ag();
                Set deletedTypes = setSchemaResponse.getDeletedTypes();
                deletedTypes.getClass();
                agVar.mo3384a();
                agVar.f2809b.addAll(deletedTypes);
                Set incompatibleTypes = setSchemaResponse.getIncompatibleTypes();
                incompatibleTypes.getClass();
                agVar.mo3384a();
                agVar.f2811d.addAll(incompatibleTypes);
                Set migratedTypes = setSchemaResponse.getMigratedTypes();
                migratedTypes.getClass();
                agVar.mo3384a();
                agVar.f2810c.addAll(migratedTypes);
                for (SetSchemaResponse.MigrationFailure migrationFailure : setSchemaResponse.getMigrationFailures()) {
                    String namespace = migrationFailure.getNamespace();
                    String documentId = migrationFailure.getDocumentId();
                    String schemaType = migrationFailure.getSchemaType();
                    AppSearchResult appSearchResult2 = migrationFailure.getAppSearchResult();
                    Function identity = Function.CC.identity();
                    appSearchResult2.getClass();
                    if (appSearchResult2.isSuccess()) {
                        cVar = C0838c.m2689a(identity.apply(appSearchResult2.getResultValue()));
                    } else {
                        cVar = new C0838c(appSearchResult2.getResultCode(), (Object) null, appSearchResult2.getErrorMessage());
                    }
                    C0835ah ahVar = new C0835ah(namespace, documentId, schemaType, cVar);
                    agVar.mo3384a();
                    agVar.f2808a.add(ahVar);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("incompatibleTypes", agVar.f2811d);
                bundle.putStringArrayList("deletedTypes", agVar.f2809b);
                bundle.putStringArrayList("migratedTypes", agVar.f2810c);
                agVar.f2812e = true;
                iVar.mo5422f(new C0836ai(agVar.f2808a));
            } catch (Throwable th) {
                iVar.mo5423g(th);
            }
        } else {
            iVar.mo5423g(new C0862a(appSearchResult.getResultCode(), appSearchResult.getErrorMessage(), (Throwable) null));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
