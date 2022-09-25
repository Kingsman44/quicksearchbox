package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.os.Bundle;
import com.evernote.android.state.InjectionHelper;
import com.evernote.android.state.Injector;
import java.util.HashMap;

/* compiled from: PG */
public class OpaAmbActivity$$StateSaver extends Injector.Object {
    private static final HashMap BUNDLERS;
    private static final InjectionHelper HELPER;

    static {
        HashMap hashMap = new HashMap();
        BUNDLERS = hashMap;
        HELPER = new InjectionHelper("com.google.android.apps.gsa.staticplugins.opa.samson.activity.OpaAmbActivity$$StateSaver", hashMap);
    }

    public void restore(OpaAmbActivity opaAmbActivity, Bundle bundle) {
        InjectionHelper injectionHelper = HELPER;
        opaAmbActivity.loggingState = (C110034n) injectionHelper.getSerializable(bundle, "loggingState");
        opaAmbActivity.state = (C110035o) injectionHelper.getSerializable(bundle, "state");
    }

    public void save(OpaAmbActivity opaAmbActivity, Bundle bundle) {
        InjectionHelper injectionHelper = HELPER;
        injectionHelper.putSerializable(bundle, "loggingState", opaAmbActivity.loggingState);
        injectionHelper.putSerializable(bundle, "state", opaAmbActivity.state);
    }
}
