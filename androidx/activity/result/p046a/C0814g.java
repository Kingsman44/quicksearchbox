package androidx.activity.result.p046a;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.activity.result.a.g */
/* compiled from: PG */
public final class C0814g extends C0809b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo613a(Context context, Object obj) {
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        C69664n.m101061g(intentSenderRequest, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        C69664n.m101060f(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo614b(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
