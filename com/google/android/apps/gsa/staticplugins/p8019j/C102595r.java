package com.google.android.apps.gsa.staticplugins.p8019j;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6491a.p6492a.C84340a;
import com.google.android.apps.gsa.search.core.p6491a.p6492a.C84341b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.r */
/* compiled from: PG */
public final /* synthetic */ class C102595r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102550al f286352a;

    /* renamed from: b */
    public final /* synthetic */ boolean f286353b;

    public /* synthetic */ C102595r(C102550al alVar, boolean z) {
        this.f286352a = alVar;
        this.f286353b = z;
    }

    public final C60870cx apply(Object obj) {
        C102550al alVar = this.f286352a;
        boolean z = this.f286353b;
        C51714bl blVar = (C51714bl) obj;
        StringBuilder sb = new StringBuilder("alarm.CREATE_ALARM,1;alarm.MUTATE_ALARM,2;alarm.REMOVE_ALARM,1;alarm.SNOOZE_ALARM,1;alarm.STOP_ALARM,1;audio.SLICE_AUDIO,1;battery.LEVEL_LOOKUP,1;call.CALL,3;chat_message.SEND,1;client.RECONNECT,2;contact.CALL_HISTORY_LOOKUP,1;contact.LOOKUP,1;credential.UPDATE,2;device.GET_SETTINGS,2;device.MODIFY_SETTING,2;device.RECORD_VIDEO,1;device.REQUEST_PERMISSION,3;device.TAKE_PHOTO,1;geller.UPDATE_ON_DEVICE_STORE,1;media.CLEAR_FOCUS,1;media.NEXT,1;media.ON_DEVICE_LOOKUP,1;media.PAUSE,1;media.PLAY_MEDIA,2;media.PREPARE_MEDIA,1;media.PREVIOUS,1;media.REPLAY_MEDIA_ITEM,1;media.RESUME,1;media.SEEK_RELATIVE,1;media.SEEK_TO_POSITION,1;media.SET_FOCUS,1;media.SET_RATING,1;media.SET_REPEAT,1;media.SHUFFLE,1;media.STOP,1;notification.MARK_AS_READ,1;precise_user_location.GET,1;provider.OPEN,1;provider.VERIFY,1;stopwatch.PAUSE_STOPWATCH,1;stopwatch.RESET_STOPWATCH,1;stopwatch.SHOW_STOPWATCH,1;stopwatch.START_STOPWATCH,1;timer.CREATE_TIMER,1;timer.REMOVE_TIMER,1;timer.UPDATE_TIMER,1;tts.OUTPUT,3;tts.STOP,1;ui.SHOW_NOTIFICATION,2;video_call.CALL,3;notification.REPLY,1;notification.READ,1;notification.FETCH,1;mic.UPDATE,1;");
        sb.append(((C86124t) alVar.f286203c.mo27525b()).mo79758x(C90086ek.f250441dG));
        if (!z && ((C86124t) alVar.f286203c.mo27525b()).mo79746e(C90051dc.f248775J)) {
            sb.append("ui.SHOW_RENDERED_CARD,1;");
        }
        C84340a aVar = (C84340a) C84341b.f229550d.createBuilder();
        String str = ((C51715bm) blVar.instance).f135666c;
        aVar.copyOnWrite();
        C84341b bVar = (C84341b) aVar.instance;
        str.getClass();
        bVar.f229552a |= 1;
        bVar.f229553b = str;
        alVar.mo93335l((C84341b) aVar.build(), blVar, sb.toString(), BuildConfig.FLAVOR);
        C102550al.m170055m(blVar, (int) ((C86124t) alVar.f286203c.mo27525b()).mo79743a(C90014bt.f247498iL));
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        bmVar.f135677n = 1;
        bmVar.f135664a |= C89885b.S3REQUEST_VALUE;
        alVar.mo93333i(blVar);
        C102550al.m170054k(blVar);
        alVar.mo93332h(blVar, C58836b.f156633a, ((C86124t) alVar.f286203c.mo27525b()).mo79746e(C90051dc.f248847bB), true);
        alVar.mo93334j(blVar);
        return C60856cj.m92900i(blVar);
    }
}
