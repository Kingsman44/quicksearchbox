package com.google.android.apps.gsa.staticplugins.p7614bx.p7621d;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.d.c */
/* compiled from: PG */
public final class C97422c implements C23113i {

    /* renamed from: a */
    private final C97419a f272064a;

    public C97422c(C97419a aVar) {
        this.f272064a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("MenuEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onAccountChanged_java.lang.String")) {
                String string = pVar.f63472a.getString("accountName");
                string.getClass();
                this.f272064a.mo90694h(string);
            } else if (str.equals("onContributionsClicked")) {
                this.f272064a.mo90695i();
            } else if (str.equals("onGoogleAppIncognitoModeClicked")) {
                this.f272064a.mo90696j();
            } else if (str.equals("onHelpClicked")) {
                this.f272064a.mo90697k();
            } else if (str.equals("onHideExplicitResultsClicked")) {
                this.f272064a.mo90698l();
            } else if (str.equals("onLogout")) {
                this.f272064a.mo90699m();
            } else if (str.equals("onRecentsClicked")) {
                this.f272064a.mo90700n();
            } else if (str.equals("onRemindersClicked")) {
                this.f272064a.mo90701o();
            } else if (str.equals("onSearchHistoryClicked")) {
                this.f272064a.mo90702p();
            } else if (str.equals("onSearchWidgetCustomizedClicked")) {
                this.f272064a.mo90703q();
            } else if (str.equals("onSettingsClicked")) {
                this.f272064a.mo90704r();
            } else if (str.equals("onUpdatesClicked")) {
                this.f272064a.mo90705s();
            } else if (str.equals("onYourDataInSearchClicked")) {
                this.f272064a.mo90706t();
            }
        }
    }
}
