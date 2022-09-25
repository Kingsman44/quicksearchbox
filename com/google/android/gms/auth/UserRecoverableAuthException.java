package com.google.android.gms.auth;

import android.content.Intent;

/* compiled from: PG */
public class UserRecoverableAuthException extends C142903e {

    /* renamed from: a */
    private final Intent f387652a;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.f387652a = intent;
    }

    /* renamed from: a */
    public final Intent mo117772a() {
        Intent intent = this.f387652a;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
