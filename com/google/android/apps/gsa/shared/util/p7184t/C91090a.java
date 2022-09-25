package com.google.android.apps.gsa.shared.util.p7184t;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.shared.util.t.a */
/* compiled from: PG */
public class C91090a extends C91093c implements C91096f {

    /* renamed from: e */
    private static final C59071e f254378e = C59071e.m91332i("com.google.android.apps.gsa.shared.util.t.a");

    /* renamed from: a */
    public final Activity f254379a;

    /* renamed from: b */
    final Map f254380b = new HashMap();

    /* renamed from: c */
    public final AtomicInteger f254381c;

    public C91090a(Activity activity, Context context, int i) {
        super(context);
        this.f254379a = activity;
        this.f254381c = new AtomicInteger(i);
    }

    /* renamed from: a */
    public boolean mo65089a(Intent intent) {
        if (mo85363m(intent)) {
            return mo65090b(intent, this);
        }
        boolean a = super.mo65089a(intent);
        if (intent.getBooleanExtra("EXTRA_FINISH_ACTIVITY", false)) {
            this.f254379a.finish();
        } else if (intent.getBooleanExtra("EXTRA_FINISH_ACTIVITY_AND_REMOVE_TASK", false)) {
            this.f254379a.finishAndRemoveTask();
        } else if (intent.getBooleanExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.MOVE_TASK_TO_BACK", false)) {
            this.f254379a.moveTaskToBack(false);
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo65090b(Intent intent, C91096f fVar) {
        int andIncrement = this.f254381c.getAndIncrement();
        fVar.getClass();
        try {
            intent.setFlags(intent.getFlags() & -268435457);
            this.f254380b.put(Integer.valueOf(andIncrement), fVar);
            this.f254379a.startActivityForResult(intent, andIncrement, mo85360j(intent));
            return true;
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f254378e.mo56225c()).mo56382g(e)).mo56372aa(11442)).mo56389s("No activity found for %s", intent);
            this.f254380b.remove(Integer.valueOf(andIncrement));
            mo85361k(intent);
            return false;
        } catch (SecurityException e2) {
            m148827n(intent, e2);
            this.f254380b.remove(Integer.valueOf(andIncrement));
            mo85361k(intent);
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo65092d() {
        return true;
    }

    /* renamed from: e */
    public final boolean mo65093e() {
        return true;
    }

    /* renamed from: g */
    public final void mo85356g(int i, int i2, Intent intent, Context context) {
        Map map = this.f254380b;
        Integer valueOf = Integer.valueOf(i);
        C91096f fVar = (C91096f) map.remove(valueOf);
        if (fVar == null) {
            ((C59052c) ((C59052c) f254378e.mo56226d()).mo56372aa(11440)).mo56387q("Got result callback with request code: %d with no callback in this object, could belong to someone else", i);
        } else if (!fVar.mo17703hg(i2, intent, context)) {
            this.f254380b.put(valueOf, fVar);
        }
    }

    /* renamed from: h */
    public final void mo85357h(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f254380b.entrySet()) {
            C91096f fVar = (C91096f) entry.getValue();
            if (fVar instanceof Parcelable) {
                bundle2.putParcelable(String.valueOf(entry.getKey()), (Parcelable) fVar);
            }
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("velvet:activity_intent_starter:callbacks", bundle2);
        }
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        return true;
    }

    /* renamed from: i */
    public final void mo85358i(Bundle bundle) {
        if (bundle != null && bundle.containsKey("velvet:activity_intent_starter:callbacks")) {
            Bundle bundle2 = bundle.getBundle("velvet:activity_intent_starter:callbacks");
            for (String str : bundle2.keySet()) {
                this.f254380b.put(Integer.valueOf(str), (C91096f) bundle2.getParcelable(str));
            }
        }
    }

    /* renamed from: c */
    public final boolean mo65091c(IntentSender intentSender, C91096f fVar) {
        fVar.getClass();
        try {
            int andIncrement = this.f254381c.getAndIncrement();
            this.f254380b.put(Integer.valueOf(andIncrement), fVar);
            this.f254379a.startIntentSenderForResult(intentSender, andIncrement, (Intent) null, 0, 0, 0);
            return true;
        } catch (IntentSender.SendIntentException e) {
            ((C59052c) ((C59052c) ((C59052c) f254378e.mo56225c()).mo56382g(e)).mo56372aa(11443)).mo56389s("No intent sender found for %s", intentSender);
            return false;
        }
    }
}
