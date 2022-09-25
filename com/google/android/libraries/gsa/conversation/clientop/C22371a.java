package com.google.android.libraries.gsa.conversation.clientop;

import java.text.MessageFormat;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.a */
/* compiled from: PG */
public final class C22371a extends Exception {
    public C22371a(String str) {
        super(MessageFormat.format("{0} was not found in ClientOp.args", new Object[]{str}));
    }
}
