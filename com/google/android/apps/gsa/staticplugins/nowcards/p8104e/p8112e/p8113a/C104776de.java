package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.DialogInterface;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.de */
/* compiled from: PG */
public final /* synthetic */ class C104776de implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C104779dh f291871a;

    public /* synthetic */ C104776de(C104779dh dhVar) {
        this.f291871a = dhVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C104779dh dhVar = this.f291871a;
        if (dhVar.f291875b.mo28316z()) {
            dhVar.f291875b.mo28345s("EVENT_CARD_ACTION_DIALOG_DISMISSED", dhVar.f291877d, ProtoParcelable.f63423a);
            dhVar.mo94349c();
        }
    }
}
