package com.google.android.apps.gsa.shared.search;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionEntry;
import android.os.Bundle;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;

/* compiled from: PG */
public class RestrictedProfileBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(24);
        Bundle bundleExtra = intent.getBundleExtra("android.intent.extra.restrictions_bundle");
        RestrictionEntry restrictionEntry = new RestrictionEntry("enable_google_search", bundleExtra != null && bundleExtra.getBoolean("enable_google_search", false));
        restrictionEntry.setTitle(context.getResources().getString(R.string.enable_google_search_restriction));
        ArrayList c = C58597ky.m90212c(restrictionEntry);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("android.intent.extra.restrictions_list", c);
        setResult(-1, (String) null, bundle);
    }
}
