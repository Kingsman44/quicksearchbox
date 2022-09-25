package com.google.android.apps.gsa.staticplugins.p7381ai;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.apps.gsa.search.core.p6807j.C86134c;
import com.google.android.apps.gsa.search.core.p6807j.C86135d;
import com.google.android.apps.gsa.search.core.state.p6864a.C86801p;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ai.c */
/* compiled from: PG */
public final class C93876c implements C84510a {

    /* renamed from: a */
    public static final C59071e f262180a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ai.c");

    /* renamed from: b */
    private final C91097g f262181b;

    /* renamed from: c */
    private final C68214a f262182c;

    /* renamed from: d */
    private final C68214a f262183d;

    /* renamed from: e */
    private final C68214a f262184e;

    /* renamed from: f */
    private final C22871g f262185f;

    public C93876c(C91097g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar2) {
        this.f262181b = gVar;
        this.f262182c = aVar;
        this.f262183d = aVar2;
        this.f262184e = aVar3;
        this.f262185f = gVar2;
    }

    /* renamed from: a */
    public final void mo78216a(Uri uri, C84512c cVar) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_LAUNCH_NEW_TASK_OVERRIDE", false);
        C60494rz a = C60494rz.m92598a(cVar.f230004b);
        if (a == null) {
            a = C60494rz.UNKNOWN;
        }
        intent.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", a.f163762v);
        if (cVar.f230005c) {
            intent.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_REMOVE_SAVE_BUTTON", true);
        }
        if (cVar.f230006d) {
            intent.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_REUSE_LAST_SESSION", true);
        }
        if ((cVar.f230003a & 8) != 0) {
            C57566aj ajVar = cVar.f230007e;
            if (ajVar == null) {
                ajVar = C57566aj.f153791e;
            }
            intent.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_COLLECTION_LIST", ajVar.toByteArray());
        }
        if ((cVar.f230003a & 16) != 0) {
            intent.putExtra("com.google.android.apps.gsa.customtabs.IS_SAVED", cVar.f230008f);
        }
        if (cVar.f230009g) {
            intent.putExtra("com.google.android.apps.gsa.customtabs.EXTRA_USE_PROVIDED_TRANSITION", true);
        }
        C86135d a2 = ((C86134c) this.f262182c.mo27525b()).mo79784a(intent);
        C60870cx a3 = a2.mo79773a();
        if (a3.isDone()) {
            mo88200b((Intent) C60856cj.m92910s(a3), a2.mo79774b());
        } else {
            new C90873ag(a3, this.f262185f, "Launch URL intent", new C93874a(this, a2)).mo85223a(C93875b.f262179a);
        }
    }

    /* renamed from: b */
    public final void mo88200b(Intent intent, boolean z) {
        this.f262181b.mo65089a(intent);
        ((C86801p) this.f262183d.mo27525b()).mo80495a(intent, z);
        if (z) {
            ((C89859i) this.f262184e.mo27525b()).mo83702b(C89849ae.CCT_INTENT_STARTED);
        }
        if (intent.getBooleanExtra("com.google.android.apps.gsa.customtabs.LOG_NO_SESSION_APP_FLOW", false)) {
            ((C89859i) this.f262184e.mo27525b()).mo83702b(C89849ae.CCT_LAUNCHED_WITHOUT_SESSION);
        }
    }
}
