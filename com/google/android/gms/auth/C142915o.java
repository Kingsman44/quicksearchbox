package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.C144023z;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.o */
/* compiled from: PG */
public final class C142915o {

    /* renamed from: a */
    public final Context f387822a;

    public C142915o(Context context) {
        this.f387822a = context;
    }

    /* renamed from: a */
    public final C146006ab mo117810a(String str) {
        try {
            C142914n.m231867o(this.f387822a, str);
            return C146021aq.m237850d((Object) null);
        } catch (C142903e | IOException e) {
            return C146021aq.m237849c(e);
        }
    }

    /* renamed from: b */
    public final C146006ab mo117811b(String str) {
        try {
            return C146021aq.m237850d(C142914n.m231858f(this.f387822a, str));
        } catch (C142903e | IOException e) {
            return C146021aq.m237849c(e);
        }
    }

    /* renamed from: c */
    public final C146006ab mo117812c(Account account, String str, Bundle bundle) {
        try {
            return C146021aq.m237850d(C142914n.m231869q(this.f387822a, account, str, bundle));
        } catch (C142903e | IOException e) {
            return C146021aq.m237849c(e);
        }
    }

    /* renamed from: d */
    public final C146006ab mo117813d() {
        try {
            return C146021aq.m237850d(C142904f.m231842a(this.f387822a));
        } catch (RemoteException | C144022y | C144023z e) {
            return C146021aq.m237849c(e);
        }
    }

    /* renamed from: e */
    public final C146006ab mo117814e(String[] strArr) {
        try {
            return C146021aq.m237850d(C142904f.m231843b(this.f387822a, strArr));
        } catch (C142903e | IOException e) {
            return C146021aq.m237849c(e);
        }
    }
}
