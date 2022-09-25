package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.a */
/* compiled from: PG */
public final class C81921a {

    /* renamed from: a */
    private static final C58495hd f223991a;

    /* renamed from: b */
    private static final C58495hd f223992b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("com.motorola.hardware.cli", C58485gu.m89847o(4096, 1));
        f223991a = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("com.samsung.android.hardware.display.category.BUILTIN", 1);
        f223992b = gzVar2.mo55427f(false);
    }

    /* renamed from: a */
    public static Display m130163a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return m130166d(displayManager, context.getPackageManager());
    }

    /* renamed from: b */
    public static boolean m130164b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || !m130165c(displayManager) || m130166d(displayManager, context.getPackageManager()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m130165c(DisplayManager displayManager) {
        int i;
        Display display;
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            i = 0;
        } else {
            i = display.getState();
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static Display m130166d(DisplayManager displayManager, PackageManager packageManager) {
        Display display;
        C58800sl lA = f223991a.entrySet().iterator();
        loop0:
        while (true) {
            if (!lA.hasNext()) {
                display = null;
                break;
            }
            Map.Entry entry = (Map.Entry) lA.next();
            entry.getKey();
            if (packageManager.hasSystemFeature((String) entry.getKey())) {
                entry.getKey();
                entry.getValue();
                C58485gu guVar = (C58485gu) entry.getValue();
                int size = guVar.size();
                int i = 0;
                while (i < size) {
                    display = displayManager.getDisplay(((Integer) guVar.get(i)).intValue());
                    i++;
                    if (display != null) {
                        break loop0;
                    }
                }
                continue;
            }
        }
        if (display != null) {
            return display;
        }
        C58800sl lA2 = f223992b.entrySet().iterator();
        while (lA2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) lA2.next();
            Display[] displays = displayManager.getDisplays((String) entry2.getKey());
            entry2.getKey();
            entry2.getValue();
            Arrays.toString(displays);
            if (displays.length > ((Integer) entry2.getValue()).intValue()) {
                return displays[((Integer) entry2.getValue()).intValue()];
            }
        }
        return null;
    }
}
