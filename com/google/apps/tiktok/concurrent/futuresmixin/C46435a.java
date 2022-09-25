package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Bundle;
import androidx.p060c.C0977g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.a */
/* compiled from: PG */
public final class C46435a {

    /* renamed from: a */
    public static final AtomicInteger f121535a = new AtomicInteger(123051698);

    /* renamed from: b */
    public final C0977g f121536b = new C0977g();

    /* renamed from: c */
    public final C0977g f121537c = new C0977g();

    /* renamed from: d */
    private final String f121538d;

    public C46435a(String str) {
        C58838bb.m90869d(!C58837ba.m90859h(str), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.f121538d = str;
    }

    /* renamed from: a */
    public final int mo50438a(Object obj) {
        C19559g.m37304c();
        Integer num = (Integer) this.f121537c.get(obj.getClass());
        boolean z = true;
        C58838bb.m90887v(num != null, "The callback %s has not been registered", obj.getClass());
        if (mo50439b(num.intValue()) != obj) {
            z = false;
        }
        C58838bb.m90887v(z, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", obj.getClass());
        return num.intValue();
    }

    /* renamed from: b */
    public final Object mo50439b(int i) {
        C19559g.m37304c();
        Object obj = this.f121536b.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.f121537c.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class) entry.getKey()).getName())));
                }
            }
        }
        C58838bb.m90862C(obj, "No callback existed for %s", i);
        return obj;
    }

    /* renamed from: c */
    public final void mo50440c() {
        C19559g.m37304c();
        this.f121536b.clear();
    }

    /* renamed from: d */
    public final void mo50441d(Object obj) {
        C19559g.m37304c();
        Class<?> cls = obj.getClass();
        if (this.f121537c.containsKey(cls)) {
            C58838bb.m90887v(this.f121536b.put(Integer.valueOf(((Integer) this.f121537c.get(cls)).intValue()), obj) == null, "Attempted to register the callback class % twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
            return;
        }
        int andIncrement = f121535a.getAndIncrement();
        C0977g gVar = this.f121537c;
        Integer valueOf = Integer.valueOf(andIncrement);
        gVar.put(cls, valueOf);
        this.f121536b.put(valueOf, obj);
    }

    /* renamed from: e */
    public final void mo50442e(Bundle bundle) {
        C19559g.m37304c();
        if (bundle != null) {
            String concat = "CallbackIdMap.classes".concat(this.f121538d);
            C58838bb.m90884s(bundle.containsKey(concat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String[] stringArray = bundle.getStringArray(concat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(this.f121538d));
            int i = 0;
            while (i < stringArray.length) {
                try {
                    Integer num = (Integer) this.f121537c.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int intValue = num.intValue();
                        int i2 = intArray[i];
                        C58838bb.m90891z(intValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                    i++;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo50443f(Bundle bundle) {
        C19559g.m37304c();
        String concat = "CallbackIdMap.classes".concat(this.f121538d);
        C58838bb.m90887v(!bundle.containsKey(concat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", concat);
        C0977g gVar = this.f121537c;
        int i = gVar.f3122d;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : gVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(concat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(this.f121538d), iArr);
    }

    /* renamed from: g */
    public final void mo50444g() {
        C19559g.m37304c();
        for (Map.Entry entry : this.f121537c.entrySet()) {
            C58838bb.m90887v(this.f121536b.containsKey((Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
    }
}
