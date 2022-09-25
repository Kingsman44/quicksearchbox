package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ao */
/* compiled from: PG */
final class C91964ao extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C91965ap f256456a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91964ao(C91965ap apVar) {
        super("Populate cache of launchable packages.", 2, 0);
        this.f256456a = apVar;
    }

    public final void run() {
        C91965ap apVar = this.f256456a;
        HashSet hashSet = new HashSet();
        try {
            for (ResolveInfo resolveInfo : apVar.f256460d.queryIntentActivities(C91965ap.f256457a, 0)) {
                hashSet.add(resolveInfo.activityInfo.packageName);
            }
            for (ResolveInfo resolveInfo2 : apVar.f256460d.queryIntentActivities(C91965ap.f256458b, 0)) {
                hashSet.add(resolveInfo2.activityInfo.packageName);
            }
            apVar.f256461e = hashSet;
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C91965ap.f256459c.mo56225c()).mo56382g(e)).mo56372aa(11942)).mo56386p("Package manager crashed.");
        }
    }
}
