package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10334au;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10339az;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10345c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10266k;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10267l;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.as */
/* compiled from: PG */
final class C10213as extends C10334au {

    /* renamed from: a */
    final /* synthetic */ C10216av f34662a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10213as(C10216av avVar) {
        super(avVar.f34673i, avVar.f34670f, avVar.mo18345b());
        this.f34662a = avVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ int mo18342a(Object obj, C58495hd hdVar) {
        C10339az azVar = (C10339az) obj;
        C59071e eVar = C10216av.f34665a;
        C58976aa aaVar = C58975e.f156826a;
        if (azVar.mo18431a() != 0) {
            return 1;
        }
        C49838aw b = azVar.mo18432b();
        String str = b.f129509d;
        View view = this.f34662a.f34683s;
        view.getClass();
        this.f34662a.f34671g.mo85421i(str, (ImageView) view.findViewById(R.id.app_icon_large));
        View view2 = this.f34662a.f34684t;
        view2.getClass();
        ImageView imageView = (ImageView) view2.findViewById(R.id.collapsed_app_icon);
        this.f34662a.f34671g.mo85421i(str, imageView);
        View view3 = this.f34662a.f34683s;
        view3.getClass();
        C10216av.m25100c((TextView) view3.findViewById(R.id.app_name), b.f129508c);
        View view4 = this.f34662a.f34683s;
        view4.getClass();
        C10216av.m25100c((TextView) view4.findViewById(R.id.app_description), b.f129510e);
        this.f34662a.mo18347e(imageView);
        this.f34662a.f34682r = hdVar;
        this.f34662a.mo18349g(C10383ae.m25353i(azVar), azVar.mo18433c(), Optional.m71637of(b));
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo18343b() {
        C49838aw awVar;
        C10266k kVar = C10266k.UNKNOWN;
        C10216av avVar = this.f34662a;
        C10267l lVar = avVar.f34667c;
        int i = lVar.f34805b;
        int i2 = i != 0 ? i != 2 ? i != 3 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C10325al alVar = avVar.f34669e;
            if (i == 2) {
                awVar = (C49838aw) lVar.f34806c;
            } else {
                awVar = C49838aw.f129504g;
            }
            return alVar.mo18422d(awVar.f129507b);
        } else if (i3 == 1) {
            return avVar.f34669e.mo18421c(new C10345c(i == 3 ? (String) lVar.f34806c : BuildConfig.FLAVOR));
        } else {
            throw new AssertionError("Unexpected app specific page info.");
        }
    }
}
