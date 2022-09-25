package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import java.util.Iterator;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.c */
/* compiled from: PG */
public final /* synthetic */ class C36753c implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C36755e f95766a;

    public /* synthetic */ C36753c(C36755e eVar) {
        this.f95766a = eVar;
    }

    public final void onActivityResult(Object obj) {
        C46108a aVar;
        Optional optional;
        C36755e eVar = this.f95766a;
        ActivityResult activityResult = (ActivityResult) obj;
        if (activityResult.f2755a == -1) {
            eVar.f95771d.requireView().findViewById(R.id.assistant_oobe_loading_fragment_layout).setVisibility(0);
            eVar.f95771d.requireView().findViewById(R.id.assistant_oobe_account_fragment_layout).setVisibility(8);
            eVar.f95782o = ((Intent) Objects.requireNonNull(activityResult.f2756b)).getStringExtra("authAccount");
            String str = eVar.f95782o;
            if (str != null) {
                Iterator it = eVar.f95783p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (C46108a) it.next();
                    if (!aVar.mo50210b().f121163h && "google".equals(aVar.mo50210b().f121165j) && str.equals(aVar.mo50210b().f121161f)) {
                        break;
                    }
                }
                if (aVar != null) {
                    String str2 = eVar.f95782o;
                    if (str2 != null) {
                        Iterator it2 = eVar.f95783p.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                optional = Optional.empty();
                                break;
                            }
                            C46108a aVar2 = (C46108a) it2.next();
                            if (!aVar2.mo50210b().f121163h && "google".equals(aVar2.mo50210b().f121165j) && str2.equals(aVar2.mo50210b().f121161f)) {
                                optional = Optional.m71637of(aVar2.mo50209a());
                                break;
                            }
                        }
                    } else {
                        optional = Optional.empty();
                    }
                    if (optional.isPresent()) {
                        eVar.mo40370a((AccountId) optional.get());
                    }
                }
            }
        }
    }
}
