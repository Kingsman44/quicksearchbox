package com.google.android.apps.search.googleapp.stampviewer.webview.p10505f.p10508c;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.abuse.reporting.C146729ar;
import com.google.android.libraries.p1635au.C19567d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.p335a.p336a.C6585g;
import com.google.p4242bp.p4253e.p4254a.C56192l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.f.c.d */
/* compiled from: PG */
public final class C139584d {

    /* renamed from: a */
    public final Fragment f379456a;

    /* renamed from: b */
    public final C46439e f379457b;

    /* renamed from: c */
    public final C139583c f379458c;

    /* renamed from: d */
    public final AccountId f379459d;

    /* renamed from: e */
    public final C46128f f379460e;

    /* renamed from: f */
    public final C139581a f379461f;

    /* renamed from: g */
    public final C46440f f379462g = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            C139581a aVar = C139584d.this.f379461f;
            aVar.getClass();
            ((C19567d) aVar.f379453b.f103034f.mo6453a()).mo24822a(1, "CANNOT_DETERMINE_ACCOUNT_NAME");
            ((C59052c) ((C59052c) ((C59052c) C139581a.f379452a.mo56225c()).mo56382g(th)).mo56372aa(41389)).mo56389s("STAMP report abuse failure: %s", "CANNOT_DETERMINE_ACCOUNT_NAME");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            String str;
            String str2 = (String) obj2;
            C139584d dVar = C139584d.this;
            Fragment fragment = dVar.f379456a;
            fragment.getClass();
            C139583c cVar = dVar.f379458c;
            cVar.getClass();
            Context context = fragment.getContext();
            C56192l lVar = (C56192l) ((ProtoParsers.ParcelableProto) obj).mo58938a(C56192l.f149716c, C62921ba.m95368a());
            if (str2 == null) {
                str2 = null;
            }
            String str3 = str2;
            int a = C6585g.m17996a(lVar.f149718a);
            if (a != 0) {
                switch (a) {
                    case 1:
                        break;
                    case 3:
                        str = "GOOGLE_PLUS_POST_WEB";
                        break;
                    case 4:
                        str = "GOOGLE_PLUS_COMMENT_WEB";
                        break;
                    case 5:
                        str = "GOOGLE_PLUS_PROFILE_WEB";
                        break;
                    case 6:
                        str = "GOOGLE_PLUS_PROFILE_WEB_NEW";
                        break;
                    case 7:
                        str = "GOOGLE_PLUS_PHOTOS_WEB";
                        break;
                    case 8:
                        str = "GOOGLE_PLUS_COLLECTIONS_WEB";
                        break;
                    case 9:
                        str = "GOOGLE_PLUS_COMMUNITIES_WEB";
                        break;
                    case 10:
                        str = "ARES_TESTING";
                        break;
                    case 11:
                        str = "GOOGLE_PLUS_PLUS_PAGE_PROFILE_WEB";
                        break;
                    case 14:
                        str = "GOOGLE_PHOTOS_COMMENTS";
                        break;
                    case 16:
                        str = "CLASSROOM_TEACHER_STREAM_ITEM";
                        break;
                    case 17:
                        str = "SITES_SITE";
                        break;
                    case 18:
                        str = "SITES_PAGE";
                        break;
                    case 19:
                        str = "SITES_SITE_QUAL";
                        break;
                    case 20:
                        str = "SITES_PAGE_QUAL";
                        break;
                    case 21:
                        str = "CLASSROOM_STUDENT_COURSE";
                        break;
                    case 22:
                        str = "ALBUM_ARCHIVE_PHOTO";
                        break;
                    case 23:
                        str = "CLASSROOM_STUDENT_STREAM_ITEM";
                        break;
                    case 25:
                        str = "MAPS_OFFERINGS";
                        break;
                    case 26:
                        str = "CLASSROOM_TEACHER_COMMENT";
                        break;
                    case 27:
                        str = "CLASSROOM_TEACHER_SUBMISSION";
                        break;
                    case 28:
                        str = "CLASSROOM_STUDENT_COMMENT";
                        break;
                    case 29:
                        str = "CLASSROOM_STUDENT_SUBMISSION";
                        break;
                    case 30:
                        str = "GMB_LOCAL_POSTS";
                        break;
                    case 31:
                        str = "DRIVE_DOC";
                        break;
                    case 32:
                        str = "MAPS_PLACE_QA_QUESTIONS";
                        break;
                    case 33:
                        str = "MAPS_PLACE_QA_ANSWERS";
                        break;
                    case 35:
                        str = "DRIVE_IMAGE";
                        break;
                    case 36:
                        str = "DRIVE_VIDEO";
                        break;
                    case 37:
                        str = "DRIVE_ARCHIVE";
                        break;
                    case 38:
                        str = "DRIVE_OTHER";
                        break;
                    case 43:
                        str = "DOCS_DOCUMENT";
                        break;
                    case 45:
                        str = "SERVICE_ENGINE_ZIPIT_REVIEW";
                        break;
                    case 46:
                        str = "UGC_LIVE_COMMENTS";
                        break;
                    case 47:
                        str = "JANATA_KNOWLEDGE_PANEL";
                        break;
                    case 51:
                        str = "MINDSEARCH_QUESTIONS";
                        break;
                    case 52:
                        str = "MINDSEARCH_ANSWERS";
                        break;
                    case 54:
                        str = "JANATA_HANDSHAKE_REQUEST";
                        break;
                    case 55:
                        str = "SOS_LIVE_COMMENTS";
                        break;
                    case 57:
                        str = "PRODUCT_REVIEWS_UGC_IMAGES";
                        break;
                    case 58:
                        str = "SAFEBROWSING_BINEVAL";
                        break;
                    case 59:
                        str = "DUMBLEDORE_VIDEOS";
                        break;
                    case 60:
                        str = "DRIVE_FILE";
                        break;
                    case 61:
                        str = "DUMBLEDORE_APPS";
                        break;
                    case 62:
                        str = "MAPS_PROFILE";
                        break;
                    case 64:
                        str = "LENSLETS";
                        break;
                    case 65:
                        str = "CAMEOS";
                        break;
                    case 66:
                        str = "GOOGLE_DOMAINS_REPORTS";
                        break;
                    case 67:
                        str = "MAPS_PLACE_QA_REPLIES";
                        break;
                    case 68:
                        str = "PLAY_GAMES_FRIEND_NICKNAMES";
                        break;
                    case 69:
                        str = "PLAY_GAMES_GAMER_TAG";
                        break;
                    case 70:
                        str = "GOOGLE_ULTRON_INTERNAL";
                        break;
                    case 71:
                        str = "ARES_FLOWER_POWER";
                        break;
                    case 72:
                        str = "SEARCH_WEB_STORY";
                        break;
                    case 74:
                        str = "GWM_USER_REVIEWS";
                        break;
                    case 75:
                        str = "SEARCH_CONTRIBUTIONS_WEB_STORY_TEXT";
                        break;
                    case 76:
                        str = "GWM_APP_LISTINGS";
                        break;
                    case 77:
                        str = "SEARCH_CONTRIBUTIONS_ONE_PRESENCE_PROFILE";
                        break;
                    case 78:
                        str = "SEARCH_CONTRIBUTIONS_ONE_PRESENCE_LINK";
                        break;
                    case 79:
                        str = "BUSINESS_WEBSITE_BUILDER";
                        break;
                    default:
                        str = "null";
                        break;
                }
            }
            str = "CONFIG_NAME_UNKNOWN";
            String str4 = str;
            String str5 = lVar.f149719b;
            if (str5 != null) {
                fragment.startActivity(C146729ar.m239083a(context, str4, str5, (String) null, str3, new C139582b(cVar)));
                return;
            }
            throw new IllegalArgumentException("ReportAbuse reported item id cannot be null.");
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
        }
    };

    public C139584d(Fragment fragment, C46439e eVar, C139583c cVar, C46128f fVar, AccountId accountId, C139581a aVar) {
        this.f379456a = fragment;
        this.f379457b = eVar;
        this.f379458c = cVar;
        this.f379460e = fVar;
        this.f379459d = accountId;
        this.f379461f = aVar;
    }
}
