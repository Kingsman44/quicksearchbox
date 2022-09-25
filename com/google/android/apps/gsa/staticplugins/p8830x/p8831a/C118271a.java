package com.google.android.apps.gsa.staticplugins.p8830x.p8831a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.apps.gsa.staticplugins.x.a.a */
/* compiled from: PG */
public final class C118271a {

    /* renamed from: a */
    private static final C59071e f328333a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.x.a.a");

    /* renamed from: a */
    static MessageDigest m196420a() {
        try {
            return MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            ((C59052c) ((C59052c) ((C59052c) f328333a.mo56225c()).mo56382g(e)).mo56372aa(18954)).mo56386p("Could not find algorithm SHA1");
            return null;
        }
    }
}
