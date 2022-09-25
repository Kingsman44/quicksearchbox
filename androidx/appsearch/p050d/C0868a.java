package androidx.appsearch.p050d;

import android.app.appsearch.observer.DocumentChangeInfo;
import android.app.appsearch.observer.ObserverCallback;
import android.app.appsearch.observer.SchemaChangeInfo;
import androidx.appsearch.p049c.C0864a;
import androidx.appsearch.p049c.C0867d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b.C36926i;

/* renamed from: androidx.appsearch.d.a */
/* compiled from: PG */
final class C0868a implements ObserverCallback {

    /* renamed from: a */
    final /* synthetic */ C36926i f2936a;

    public C0868a(C36926i iVar) {
        this.f2936a = iVar;
    }

    public final void onSchemaChanged(SchemaChangeInfo schemaChangeInfo) {
        schemaChangeInfo.getClass();
        C0867d dVar = new C0867d(schemaChangeInfo.getPackageName(), schemaChangeInfo.getDatabaseName(), schemaChangeInfo.getChangedSchemaNames());
        C36926i iVar = this.f2936a;
        if ("com.google.android.deskclock".equals(dVar.f2933a)) {
            iVar.f96159a.mo40470a();
        }
    }

    public final void onDocumentChanged(DocumentChangeInfo documentChangeInfo) {
        documentChangeInfo.getClass();
        C0864a aVar = new C0864a(documentChangeInfo.getPackageName(), documentChangeInfo.getDatabaseName(), documentChangeInfo.getNamespace(), documentChangeInfo.getSchemaName(), documentChangeInfo.getChangedDocumentIds());
        C36926i iVar = this.f2936a;
        if ("com.google.android.deskclock".equals(aVar.f2924a)) {
            iVar.f96159a.mo40470a();
        }
    }
}
