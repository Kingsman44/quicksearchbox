package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107533l;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107534m;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.bj */
/* compiled from: PG */
public final /* synthetic */ class C93158bj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C93162bn f259829a;

    public /* synthetic */ C93158bj(C93162bn bnVar) {
        this.f259829a = bnVar;
    }

    public final Object apply(Object obj) {
        C93162bn bnVar = this.f259829a;
        MessageNotification messageNotification = (MessageNotification) obj;
        C107533l lVar = (C107533l) C107534m.f299168d.createBuilder();
        CharSequence charSequence = messageNotification.f252535E;
        CharSequence charSequence2 = messageNotification.f252543t;
        if (charSequence2 != null) {
            if (!bnVar.f259837c.mo79746e(C90014bt.f247266ds) || !messageNotification.mo84134g() || TextUtils.isEmpty(charSequence)) {
                String obj2 = charSequence2.toString();
                lVar.copyOnWrite();
                C107534m mVar = (C107534m) lVar.instance;
                obj2.getClass();
                mVar.f299170a |= 1;
                mVar.f299171b = obj2;
            } else {
                String format = String.format(bnVar.f259836b.getString(R.string.sender_message_format_for_group_messages), new Object[]{charSequence, charSequence2});
                lVar.copyOnWrite();
                C107534m mVar2 = (C107534m) lVar.instance;
                format.getClass();
                mVar2.f299170a |= 1;
                mVar2.f299171b = format;
            }
        }
        String str = messageNotification.f252545v;
        if (str != null) {
            lVar.copyOnWrite();
            C107534m mVar3 = (C107534m) lVar.instance;
            mVar3.f299170a |= 2;
            mVar3.f299172c = str;
        }
        return (C107534m) lVar.build();
    }
}
