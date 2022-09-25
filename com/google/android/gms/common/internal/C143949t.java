package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import androidx.p060c.C0984n;
import com.google.android.gms.common.C143699aa;
import com.google.android.gms.common.p10782e.C143872b;
import com.google.android.gms.common.p10782e.C143873c;
import com.google.android.gms.common.util.C144007g;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.internal.t */
/* compiled from: PG */
public final class C143949t {

    /* renamed from: a */
    private static final C0984n f390177a = new C0984n(0);

    /* renamed from: b */
    private static Locale f390178b;

    /* renamed from: a */
    public static String m234111a(Context context) {
        String packageName = context.getPackageName();
        try {
            C143872b a = C143873c.f389983a.mo119351a(context);
            return a.f389982a.getPackageManager().getApplicationLabel(a.f389982a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m234112b(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m234113c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_enable_button);
    }

    /* renamed from: d */
    public static String m234114d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m234111a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m234118h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m234118h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m234118h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m234118h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m234118h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C144007g.m234186b(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: f */
    public static String m234116f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m234119i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m234117g(context, i);
        }
        return str == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: g */
    public static String m234117g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m234119i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m234119i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m234119i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m234119i(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
        }
    }

    /* renamed from: h */
    private static String m234118h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m234119i(context, str);
        if (i == null) {
            i = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    private static String m234119i(Context context, String str) {
        Resources resources;
        C0984n nVar = f390177a;
        synchronized (nVar) {
            Locale locale = C1897j.m5167d(C1894g.m5157a(context.getResources().getConfiguration())).f5774b.f5775a.get(0);
            if (!locale.equals(f390178b)) {
                nVar.clear();
                f390178b = locale;
            }
            String str2 = (String) nVar.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = C143699aa.f389596a;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            }
            f390177a.put(str, string);
            return string;
        }
    }

    /* renamed from: e */
    public static String m234115e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m234118h(context, "common_google_play_services_resolution_required_text", m234111a(context));
        }
        return m234114d(context, i);
    }
}
