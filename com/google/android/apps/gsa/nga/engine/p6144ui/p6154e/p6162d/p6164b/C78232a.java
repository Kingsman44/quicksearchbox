package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6162d.p6164b;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6162d.p6163a.C78229a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6197n.C78738d;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80834am;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80845ax;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80851bc;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80852bd;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.d.b.a */
/* compiled from: PG */
public final /* synthetic */ class C78232a implements C78738d {

    /* renamed from: a */
    public final /* synthetic */ C78229a f215373a;

    public /* synthetic */ C78232a(C78229a aVar) {
        this.f215373a = aVar;
    }

    /* renamed from: a */
    public final void mo73151a(Intent intent) {
        ArrayList<CharSequence> charSequenceArrayList;
        C78229a aVar = this.f215373a;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((C59052c) ((C59052c) C78229a.f215370a.mo56226d()).mo56372aa(5093)).mo56386p("onNewSystemUiConfiguration: bundle was null");
            return;
        }
        C80852bd c = C80852bd.m128731c(extras);
        C80834am amVar = (C80834am) c;
        if (amVar.f221761a.equals(C80851bc.QQ1A)) {
            if (amVar.f221762b.contains(C80845ax.TAKE_SCREENSHOT) && (charSequenceArrayList = extras.getCharSequenceArrayList("flags")) != null) {
                charSequenceArrayList.remove(C80845ax.TAKE_SCREENSHOT.f221781d);
                extras.putCharSequenceArrayList("flags", charSequenceArrayList);
            }
        }
        aVar.f215371b.mo76660b(C80852bd.m128731c(extras));
    }
}
