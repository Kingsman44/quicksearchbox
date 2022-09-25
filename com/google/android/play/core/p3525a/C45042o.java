package com.google.android.play.core.p3525a;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.C146010af;
import com.google.android.play.core.install.C45199b;
import com.google.android.play.core.p3529c.C45053a;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.google.android.play.core.a.o */
/* compiled from: PG */
final class C45042o extends C45041n {

    /* renamed from: d */
    final /* synthetic */ C45043p f117670d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45042o(C45043p pVar, C146010af afVar) {
        super(pVar, new C45053a("OnRequestInstallCallback"), afVar);
        this.f117670d = pVar;
    }

    /* renamed from: a */
    public final void mo48863a(Bundle bundle) {
        Integer num;
        Bundle bundle2 = bundle;
        super.mo48863a(bundle);
        if (C45043p.m80191a(bundle) != 0) {
            C146010af afVar = this.f117668b;
            afVar.f394698a.mo122509w(new C45199b(C45043p.m80191a(bundle)));
            return;
        }
        C146010af afVar2 = this.f117668b;
        C45043p pVar = this.f117670d;
        bundle2.getInt("version.code", -1);
        int i = bundle2.getInt("update.availability");
        bundle2.getInt("install.status", 0);
        if (bundle2.getInt("client.version.staleness", -1) == -1) {
            num = null;
        } else {
            num = Integer.valueOf(bundle2.getInt("client.version.staleness"));
        }
        bundle2.getInt("in.app.update.priority", 0);
        bundle2.getLong("bytes.downloaded");
        bundle2.getLong("total.bytes.to.download");
        HashMap hashMap = new HashMap();
        hashMap.put("blocking.destructive.intent", C45043p.m80192b(bundle2.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap.put("nonblocking.destructive.intent", C45043p.m80192b(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap.put("blocking.intent", C45043p.m80192b(bundle2.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap.put("nonblocking.intent", C45043p.m80192b(bundle2.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        C45025a aVar = new C45025a(i, num, bundle2.getLong("additional.size.required"), C45045r.m80194a(new File(pVar.f117676e.f117679a.getFilesDir(), "assetpacks")), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
        afVar2.f394698a.mo122510x(aVar);
    }
}
