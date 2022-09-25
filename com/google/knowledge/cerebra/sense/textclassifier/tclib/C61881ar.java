package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.app.RemoteAction;
import android.view.textclassifier.ConversationAction;
import androidx.core.app.C1804au;
import androidx.core.app.C1805av;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.C1932e;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.ar */
/* compiled from: PG */
public final /* synthetic */ class C61881ar implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C61881ar f167333a = new C61881ar();

    private /* synthetic */ C61881ar() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        RemoteActionCompat remoteActionCompat;
        ConversationAction conversationAction = (ConversationAction) obj;
        if (conversationAction == null) {
            return null;
        }
        String type = conversationAction.getType();
        type.getClass();
        if (conversationAction.getAction() == null) {
            remoteActionCompat = null;
        } else {
            RemoteAction action = conversationAction.getAction();
            action.getClass();
            remoteActionCompat = new RemoteActionCompat(C1932e.m5236e(C1804au.m4960c(action)), C1804au.m4962e(action), C1804au.m4961d(action), C1804au.m4958a(action));
            remoteActionCompat.f5560e = C1804au.m4964g(action);
            remoteActionCompat.f5561f = C1805av.m4966b(action);
        }
        return C61879ap.m94543a(type, remoteActionCompat, conversationAction.getTextReply(), conversationAction.getConfidenceScore(), conversationAction.getExtras(), (C58485gu) null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
