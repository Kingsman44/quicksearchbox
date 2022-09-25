package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35786a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.a */
/* compiled from: PG */
public final class C35788a implements C35786a {

    /* renamed from: a */
    private static final C59071e f93756a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.a");

    /* renamed from: b */
    private static final C58495hd f93757b;

    /* renamed from: c */
    private static final C58495hd f93758c;

    /* renamed from: d */
    private final Context f93759d;

    /* renamed from: e */
    private final C35934c f93760e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C63490p.BATTERY_LOW.name(), "battery_low");
        f93757b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("battery_low", Boolean.class.getName());
        gzVar2.mo55429h("health", Integer.class.getName());
        gzVar2.mo55429h("icon_small", Integer.class.getName());
        gzVar2.mo55429h("level", Integer.class.getName());
        gzVar2.mo55429h("plugged", Integer.class.getName());
        gzVar2.mo55429h("present", Boolean.class.getName());
        gzVar2.mo55429h("scale", Integer.class.getName());
        gzVar2.mo55429h("status", Integer.class.getName());
        gzVar2.mo55429h("technology", String.class.getName());
        gzVar2.mo55429h("temperature", Integer.class.getName());
        gzVar2.mo55429h("voltage", Integer.class.getName());
        f93758c = gzVar2.mo55427f(false);
    }

    public C35788a(Context context, C35935d dVar) {
        this.f93759d = context;
        this.f93760e = dVar.mo39899a("device.GET_SETTINGS");
    }

    /* renamed from: a */
    public final C52103fi mo39838a(String str) {
        Optional optional;
        String str2;
        C35932a.m64317b(this.f93760e, str);
        C58495hd hdVar = f93757b;
        if (!hdVar.containsKey(str)) {
            ((C59052c) ((C59052c) f93756a.mo56226d()).mo56372aa(51981)).mo56389s("Unsupported setting id %s, cannot query value, return null.", str);
            optional = Optional.empty();
        } else {
            Intent registerReceiver = this.f93759d.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                optional = Optional.empty();
            } else {
                Bundle extras = registerReceiver.getExtras();
                if (extras == null) {
                    optional = Optional.empty();
                } else {
                    String str3 = (String) hdVar.get(str);
                    if (!extras.containsKey(str3)) {
                        ((C59052c) ((C59052c) f93756a.mo56226d()).mo56372aa(51980)).mo56389s("Missing value for setting id %s, cannot query value, return null.", str);
                        optional = Optional.empty();
                    } else {
                        String str4 = (String) f93758c.get(str3);
                        if (str4 == null) {
                            ((C59052c) ((C59052c) f93756a.mo56226d()).mo56372aa(51979)).mo56389s("Missing type for setting id %s, falling back to String.", str);
                            str2 = extras.getString(str3);
                        } else if (str4.equals(Boolean.class.getName())) {
                            str2 = String.valueOf(extras.getBoolean(str3));
                        } else if (str4.equals(Integer.class.getName())) {
                            str2 = String.valueOf(extras.getInt(str3));
                        } else if (str4.equals(String.class.getName())) {
                            str2 = extras.getString(str3);
                        } else {
                            ((C59052c) ((C59052c) f93756a.mo56226d()).mo56372aa(51978)).mo56389s("Unknown type for setting id %s, falling back to String.", str);
                            str2 = extras.getString(str3);
                        }
                        if (str2 == null) {
                            optional = Optional.empty();
                        } else {
                            optional = Optional.m71637of(str2);
                        }
                    }
                }
            }
        }
        if (!optional.isPresent()) {
            this.f93760e.mo39896d(str, C62722b.UNAVAILABLE);
            return C35845bg.m64242b();
        }
        this.f93760e.mo39896d(str, C62722b.OK);
        C52099fe feVar = (C52099fe) C52103fi.f136729i.createBuilder();
        String str5 = (String) optional.get();
        feVar.copyOnWrite();
        C52103fi fiVar = (C52103fi) feVar.instance;
        str5.getClass();
        fiVar.f136731a |= 1;
        fiVar.f136732b = str5;
        feVar.copyOnWrite();
        C52103fi fiVar2 = (C52103fi) feVar.instance;
        fiVar2.f136731a |= 2;
        fiVar2.f136733c = true;
        feVar.copyOnWrite();
        C52103fi fiVar3 = (C52103fi) feVar.instance;
        fiVar3.f136734d = 2;
        fiVar3.f136731a |= 4;
        return (C52103fi) feVar.build();
    }
}
