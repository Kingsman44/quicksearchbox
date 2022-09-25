package com.google.android.apps.gsa.staticplugins.feedback;

import android.accounts.Account;
import com.google.common.base.C58817ah;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.g */
/* compiled from: PG */
public final /* synthetic */ class C101238g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C101238g f282526a = new C101238g();

    private /* synthetic */ C101238g() {
    }

    public final Object apply(Object obj) {
        boolean z;
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Account) it.next()).name.endsWith("@google.com")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
